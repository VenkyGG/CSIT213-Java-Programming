package Assignments.A3;

import java.time.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Marking_A3 {

	private static int score = 0;
	
	public static void main(String[] args) {
		// Make sure assertions are enabled
		boolean enabled = false;
		assert enabled = true; // if assertions enabled, this runs and sets enabled=true
		if (!enabled) {
			throw new RuntimeException("Assertions are NOT enabled! Run with: java -ea Marking_A3");
		}

		try {
			testAirQualityReading();
			testInterfaceAnalyser();
			testDistrictAirQualityAnalyser();
			testCityAirStat();
			System.out.println("Score:"+score);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	

	 public static void testCityAirStat() throws Exception {
	        // Ensure assertions enabled
	        boolean enabled = false;
	        assert enabled = true;
	        if (!enabled) {
	            throw new RuntimeException("Assertions are NOT enabled! Run with: java -ea Marking_A3");
	        }

	        // 1) Ensure data.csv exists in current folder
	        Path dataCsv = Paths.get("data_marking.csv");
	        if(!Files.exists(dataCsv))
	        {
	        	throw new RuntimeException("data_marking.csv not found in current folder: " + dataCsv.toAbsolutePath());
	        }
	        
	        // 2) Run CityAirStat.load()
	        CityAirStat app = new CityAirStat();
	        app.load("data_marking.csv");

	        try {
	        	// Valid data lines = 16 (the first 16 lines are valid readings)
	        	// Invalid lines are commented + 9 invalid data lines => they should not be loaded.
	        	assert app.getSize() == 16 : "Expected 16 valid readings, but got " + app.getSize();
	        	System.out.println("testCityAirStat test 1 passed");
	        	score+=1;
	        }catch(AssertionError ex){
	        	System.out.println("testCityAirStat test 1 failed - AssertionError");
	        	System.out.println(ex);
	        }catch(Exception ex) {
	        	System.out.println("testCityAirStat test 1 failed - Exception");
	        	System.out.println(ex);
	        }
	        
	        // 3) Verify errors.txt content (order not important)
	        Path errorsFile = Paths.get("errors.txt");
	        try {
	            assert Files.exists(errorsFile) : "errors.txt was not created in current folder.";
	            System.out.println("testCityAirStat errors file created passed");
	            score+=1;
	        } catch(AssertionError ex) {
	            System.out.println("testCityAirStat errors file check failed - AssertionError");
	            System.out.println(ex);
	        } catch(Exception ex) {
	            System.out.println("testCityAirStat errors file check failed - Exception");
	            System.out.println(ex);
	        }
	        
	        List<Integer> actualErrorLines = errorLineNumbers(errorsFile);

	        // Line numbers include comment lines because CityAirStat increments line count for every line read
	        // (including lines starting with '#').
	        //
	        // Based on data_marking.csv:
	        // 18: 2026-13-01,...      -> invalid reading date (month out of range)
	        // 20: 01/03/2026,...      -> invalid reading date (wrong format)
	        // 22: ,S103,...           -> invalid reading date (empty)
	        // 24: 2026-03-02,,...     -> invalid sensor id (empty)
	        // 26: 2026-03-02,S104,,   -> invalid district (empty)
	        // 28: ...,abc             -> invalid PM2.5 (not numeric)
	        // 30: ...,-0.5            -> AirQualityDataException (below 0.0)
	        // 32: ...,999.9           -> AirQualityDataException (above 500.0)
	        // 34: 2026-99-99,,North,xyz -> THREE errors on one line:
	        //     invalid reading date + invalid sensor id + invalid PM2.5
	        //
	        // Only the reported line numbers are checked; the wording of each error
	        // message is not compared. Line 34 appears THREE times because that line
	        // must produce three separate error messages. Both lists are sorted, so
	        // duplicates are preserved and compared (a Set would collapse them).
	        List<Integer> expectedErrorLines = new ArrayList<>(Arrays.asList(
	                18, 20, 22, 24, 26, 28, 30, 32, 34, 34, 34
	        ));

	        try {
	            assert actualErrorLines.equals(expectedErrorLines)
	                    : "errors.txt line numbers mismatch.\nExpected lines: " + expectedErrorLines
	                    + "\nActual lines:   " + actualErrorLines;
	            System.out.println("testCityAirStat errors content passed");
	            score+=1;
	        } catch(AssertionError ex) {
	            System.out.println("testCityAirStat errors content failed - AssertionError");
	            System.out.println(ex);
	        } catch(Exception ex) {
	            System.out.println("testCityAirStat errors content failed - Exception");
	            System.out.println(ex);
	        }
	        
	        // 4) Process with DistrictAirQualityAnalyser -> results.txt
	        app.process(new DistrictAirQualityAnalyser());

	        // 5) Verify results.txt content (order not important)
	        Path resultsFile = Paths.get("results.txt");
	        try {
	            assert Files.exists(resultsFile) : "results.txt was not created in current folder.";
	            System.out.println("testCityAirStat results file created passed");
	            score+=1;
	        } catch(AssertionError ex) {
	            System.out.println("testCityAirStat results file check failed - AssertionError");
	            System.out.println(ex);
	        } catch(Exception ex) {
	            System.out.println("testCityAirStat results file check failed - Exception");
	            System.out.println(ex);
	        }
	        
	        Map<String, Double> actualResults = parseResultsFile(resultsFile);

	        // Expected computed averages (rounded to 2 decimals by DistrictAirQualityAnalyser)
	        Map<String, Double> expectedResults = new HashMap<>();
	        expectedResults.put("2026-03-01_North", 41.65); // (42.5+38.7+45.3+40.1)/4 = 41.65
	        expectedResults.put("2026-03-01_South", 59.20); // (60.2+55.8+58.1+62.7)/4 = 59.20
	        expectedResults.put("2026-03-02_North", 49.95); // (50.1+47.9+52.3+49.5)/4 = 49.95
	        expectedResults.put("2026-03-02_South", 67.80); // (65.7+70.2+68.4+66.9)/4 = 67.80

	        try {
	            assert actualResults.size() == expectedResults.size()
	                    : "Expected " + expectedResults.size() + " result entries, but got " + actualResults.size()
	                    + "\nActual keys: " + actualResults.keySet();
	            System.out.println("testCityAirStat results size passed");
	            score+=1;
	        } catch(AssertionError ex) {
	            System.out.println("testCityAirStat results size failed - AssertionError");
	            System.out.println(ex);
	        } catch(Exception ex) {
	            System.out.println("testCityAirStat results size failed - Exception");
	            System.out.println(ex);
	        }
	        
	        // Compare each expected key/value with tolerance
	        double eps = 1e-9;
	        for (Map.Entry<String, Double> exp : expectedResults.entrySet()) {
	            String key = exp.getKey();
	            
	            try {
	                assert actualResults.containsKey(key)
	                        : "Missing key in results.txt: " + key + "\nActual keys: " + actualResults.keySet();
	                System.out.println("testCityAirStat results key '" + key + "' exists passed");
	                score+=1;
	            } catch(AssertionError ex) {
	                System.out.println("testCityAirStat results key '" + key + "' check failed - AssertionError");
	                System.out.println(ex);
	            } catch(Exception ex) {
	                System.out.println("testCityAirStat results key '" + key + "' check failed - Exception");
	                System.out.println(ex);
	            }

	            double actual = actualResults.get(key);
	            double expected = exp.getValue();

	            try {
	                assert Math.abs(actual - expected) < eps
	                        : "Value mismatch for key '" + key + "'. Expected " + expected + " but got " + actual;
	                System.out.println("testCityAirStat results value '" + key + "' = " + actual + " passed");
	                score+=1;
	            } catch(AssertionError ex) {
	                System.out.println("testCityAirStat results value '" + key + "' check failed - AssertionError");
	                System.out.println(ex);
	            } catch(Exception ex) {
	                System.out.println("testCityAirStat results value '" + key + "' check failed - Exception");
	                System.out.println(ex);
	            }
	        }
	        
	        System.out.println("All CityAirStat assertion tests completed.");
	    }

	    // ---------- Helpers ----------

	    /**
	     * Reads errors.txt and extracts only the line number from each error message.
	     * Each non-empty line must be in the form: "Line <number>: <message>".
	     * The message text after the colon is not checked.
	     * Returns a sorted List of line numbers so that duplicates (multiple errors
	     * reported for the same data line) are preserved and compared.
	     */
	    private static List<Integer> errorLineNumbers(Path file) throws IOException {
	        List<String> lines = Files.readAllLines(file);
	        List<Integer> list = new ArrayList<>();
	        java.util.regex.Pattern p = java.util.regex.Pattern.compile("^Line\\s+(\\d+)\\s*:");
	        for (String line : lines) {
	            String t = line.trim();
	            if (t.isEmpty()) continue;
	            java.util.regex.Matcher m = p.matcher(t);
	            try {
	                assert m.find() : "Error line does not start with 'Line <number>:' -> '" + t + "'";
	            } catch(AssertionError ex) {
	                System.out.println("errorLineNumbers parsing failed - AssertionError");
	                System.out.println(ex);
	            } catch(Exception ex) {
	                System.out.println("errorLineNumbers parsing failed - Exception");
	                System.out.println(ex);
	            }
	            list.add(Integer.parseInt(m.group(1)));
	        }
	        Collections.sort(list);
	        return list;
	    }

	    /**
	     * Parse results.txt format:
	     *   <key> : <value>
	     * Example:
	     *   2026-02-05_North : 37.97
	     *
	     * Returns map of key->double.
	     */
	    private static Map<String, Double> parseResultsFile(Path file) throws IOException {
	        List<String> lines = Files.readAllLines(file);
	        Map<String, Double> map = new HashMap<>();

	        for (String line : lines) {
	            String trimmed = line.trim();
	            if (trimmed.isEmpty()) continue;

	            String[] parts = trimmed.split("\\s*:\\s*");
	            try {
	                assert parts.length == 2 : "Invalid results line format: '" + trimmed + "'";
	            } catch(AssertionError ex) {
	                System.out.println("parseResultsFile format check failed - AssertionError");
	                System.out.println(ex);
	            } catch(Exception ex) {
	                System.out.println("parseResultsFile format check failed - Exception");
	                System.out.println(ex);
	            }

	            String key = parts[0].trim();

	            double value;
	            try {
	                value = Double.parseDouble(parts[1].trim());
	            } catch (NumberFormatException e) {
	                System.out.println("parseResultsFile numeric parsing failed - NumberFormatException");
	                System.out.println("Invalid numeric value in results line: '" + trimmed + "'");
	                throw new AssertionError("Invalid numeric value in results line: '" + trimmed + "'");
	            }

	            map.put(key, value);
	        }

	        return map;
	    }


	
	
	

	// ##########################################################################################
	private static void testDistrictAirQualityAnalyser() {
		testImplementsAnalyserInDistrictAirQualityAnalyser();
		testHasCorrectProcessMethodInDistrictAirQualityAnalyser();
		System.out.println("All DistrictAirQualityAnalyser assertion tests PASSED.");
	}

	/** Test that DistrictAirQualityAnalyser implements the Analyser interface */
	private static void testImplementsAnalyserInDistrictAirQualityAnalyser() {
		// Option 1: Check via "instanceof" (simple & clear)
		DistrictAirQualityAnalyser daa = new DistrictAirQualityAnalyser();
		try {
			assert (daa instanceof Analyser)
					: "DistrictAirQualityAnalyser should implement Analyser (instanceof check failed).";
			System.out.println("testImplementsAnalyserInDistrictAirQualityAnalyser - instanceof check passed");
			score+=1;
		} catch(AssertionError ex) {
			System.out.println("testImplementsAnalyserInDistrictAirQualityAnalyser - instanceof check failed - AssertionError");
			System.out.println(ex);
		} catch(Exception ex) {
			System.out.println("testImplementsAnalyserInDistrictAirQualityAnalyser - instanceof check failed - Exception");
			System.out.println(ex);
		}

		// Option 2: Check via reflection (robust)
		Class<?>[] interfaces = DistrictAirQualityAnalyser.class.getInterfaces();
		boolean found = false;
		for (Class<?> i : interfaces) {
			if (i.equals(Analyser.class)) {
				found = true;
				break;
			}
		}
		try {
			assert found : "DistrictAirQualityAnalyser should declare 'implements Analyser'.";
			System.out.println("testImplementsAnalyserInDistrictAirQualityAnalyser - reflection check passed");
			score+=1;
		} catch(AssertionError ex) {
			System.out.println("testImplementsAnalyserInDistrictAirQualityAnalyser - reflection check failed - AssertionError");
			System.out.println(ex);
		} catch(Exception ex) {
			System.out.println("testImplementsAnalyserInDistrictAirQualityAnalyser - reflection check failed - Exception");
			System.out.println(ex);
		}
	}

	/**
	 * Test that DistrictAirQualityAnalyser has a process method with correct signature
	 */
	private static void testHasCorrectProcessMethodInDistrictAirQualityAnalyser() {
		try {
			// getMethod checks PUBLIC methods (including those from interface)
			Method m = DistrictAirQualityAnalyser.class.getMethod("process", ArrayList.class);

			// Return type should be HashMap
			try {
				assert m.getReturnType().equals(HashMap.class)
						: "process must return HashMap<String, Double> (raw type check failed). Found: "
								+ m.getReturnType().getName();
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - return type passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - return type failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - return type failed - Exception");
				System.out.println(ex);
			}

			// Must be public
			try {
				assert Modifier.isPublic(m.getModifiers()) : "process method must be public.";
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - public check passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - public check failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - public check failed - Exception");
				System.out.println(ex);
			}

			// Not static
			try {
				assert !Modifier.isStatic(m.getModifiers()) : "process method must NOT be static.";
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - static check passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - static check failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - static check failed - Exception");
				System.out.println(ex);
			}
		} catch (NoSuchMethodException e) {
			System.out.println("testHasCorrectProcessMethodInDistrictAirQualityAnalyser - method not found - NoSuchMethodException");
			System.out.println("Missing method: public HashMap<String, Double> process(ArrayList<AirQualityReading> data)");
		}
	}

	// ##########################################################################################
	private static void testInterfaceAnalyser() {
		testIsInterface();
		testHasCorrectProcessMethodInInterfaceAnalyser();
		System.out.println("All Analyser assertion tests PASSED.");

	}

	private static void testIsInterface() {
		try {
			assert Analyser.class.isInterface() : "Analyser should be an interface, but is not.";
			System.out.println("testIsInterface passed");
			score+=1;
		} catch(AssertionError ex) {
			System.out.println("testIsInterface failed - AssertionError");
			System.out.println(ex);
		} catch(Exception ex) {
			System.out.println("testIsInterface failed - Exception");
			System.out.println(ex);
		}
	}

	private static void testHasCorrectProcessMethodInInterfaceAnalyser() {
		Method[] methods = Analyser.class.getDeclaredMethods();
		boolean found = false;

		for (Method m : methods) {
			if (m.getName().equals("process")) {
				// Check parameter types
				Class<?>[] params = m.getParameterTypes();
				try {
					assert params.length == 1 : "process should take exactly 1 argument";
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - parameter count passed");
					score+=1;
				} catch(AssertionError ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - parameter count failed - AssertionError");
					System.out.println(ex);
				} catch(Exception ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - parameter count failed - Exception");
					System.out.println(ex);
				}

				try {
					assert params[0].equals(ArrayList.class) : "process should take ArrayList<AirQualityReading> as parameter";
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - parameter type passed");
					score+=1;
				} catch(AssertionError ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - parameter type failed - AssertionError");
					System.out.println(ex);
				} catch(Exception ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - parameter type failed - Exception");
					System.out.println(ex);
				}

				// Check return type
				try {
					assert m.getReturnType().equals(HashMap.class) : "process should return HashMap<String, Double>";
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - return type passed");
					score+=1;
				} catch(AssertionError ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - return type failed - AssertionError");
					System.out.println(ex);
				} catch(Exception ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - return type failed - Exception");
					System.out.println(ex);
				}

				// Check public & abstract (interface methods are implicitly public abstract)
				try {
					assert Modifier.isPublic(m.getModifiers()) : "process should be public";
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - public check passed");
					score+=1;
				} catch(AssertionError ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - public check failed - AssertionError");
					System.out.println(ex);
				} catch(Exception ex) {
					System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - public check failed - Exception");
					System.out.println(ex);
				}

				found = true;
			}
		}

		try {
			assert found
					: "Analyser interface must declare method: HashMap<String, Double> process(ArrayList<AirQualityReading> data)";
			System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - method found passed");
			score+=1;
		} catch(AssertionError ex) {
			System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - method found failed - AssertionError");
			System.out.println(ex);
		} catch(Exception ex) {
			System.out.println("testHasCorrectProcessMethodInInterfaceAnalyser - method found failed - Exception");
			System.out.println(ex);
		}
	}

	// ##########################################################################################
	private static void testAirQualityReading() {
		testValidConstructionAndGetters();
		testNullDateThrows();
		testPm25BelowMinThrows();
		testPm25AboveMaxThrows();
		testBoundaryPm25Allowed();
		testEqualsSameSensorIdSameDateTrue();
		testEqualsSameSensorIdDifferentDateFalse();
		testEqualsDifferentSensorIdSameDateFalse();
		testEqualsNullAndDifferentTypeFalse();
		testToStringContainsFields();

		System.out.println("All AirQualityReading assertion tests PASSED.");
	}

	private static void testValidConstructionAndGetters() {
		try {
			LocalDate date = LocalDate.of(2026, 2, 5);
			AirQualityReading reading = new AirQualityReading("S001", "North", date, 35.2);

			try {
				assert "S001".equals(reading.getSensorId()) : "sensorId getter failed";
				System.out.println("testValidConstructionAndGetters - sensorId passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testValidConstructionAndGetters - sensorId failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testValidConstructionAndGetters - sensorId failed - Exception");
				System.out.println(ex);
			}

			try {
				assert "North".equals(reading.getDistrict()) : "district getter failed";
				System.out.println("testValidConstructionAndGetters - district passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testValidConstructionAndGetters - district failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testValidConstructionAndGetters - district failed - Exception");
				System.out.println(ex);
			}

			try {
				assert date.equals(reading.getReadingDateTime()) : "readingDate getter failed";
				System.out.println("testValidConstructionAndGetters - readingDate passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testValidConstructionAndGetters - readingDate failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testValidConstructionAndGetters - readingDate failed - Exception");
				System.out.println(ex);
			}

			try {
				assert reading.getYear() == 2026 : "getYear failed";
				System.out.println("testValidConstructionAndGetters - getYear passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testValidConstructionAndGetters - getYear failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testValidConstructionAndGetters - getYear failed - Exception");
				System.out.println(ex);
			}

			try {
				assert reading.getMonth() == 2 : "getMonth failed";
				System.out.println("testValidConstructionAndGetters - getMonth passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testValidConstructionAndGetters - getMonth failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testValidConstructionAndGetters - getMonth failed - Exception");
				System.out.println(ex);
			}

			try {
				assert Math.abs(reading.getPm25() - 35.2) < 1e-9 : "pm25 getter failed";
				System.out.println("testValidConstructionAndGetters - pm25 passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testValidConstructionAndGetters - pm25 failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testValidConstructionAndGetters - pm25 failed - Exception");
				System.out.println(ex);
			}
		} catch (AirQualityDataException e) {
			System.out.println("testValidConstructionAndGetters failed - AirQualityDataException");
			System.out.println("Valid construction should not throw: " + e.getMessage());
		}
	}

	private static void testNullDateThrows() {
		try {
			new AirQualityReading("S001", "North", null, 35.0);
			System.out.println("testNullDateThrows failed - No exception thrown");
			System.out.println("Expected AirQualityDataException for null date, but none was thrown");
		} catch (AirQualityDataException e) {
			try {
				assert e.getMessage() != null : "Exception message should not be null";
				System.out.println("testNullDateThrows - message not null passed");
				score+=10;
			} catch(AssertionError ex) {
				System.out.println("testNullDateThrows - message not null failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testNullDateThrows - message not null failed - Exception");
				System.out.println(ex);
			}

			try {
				assert e.getMessage().toLowerCase().contains("invalid reading date")
						: "Message should mention invalid reading date. Actual: " + e.getMessage();
				System.out.println("testNullDateThrows - message content passed");
				score+=10;
			} catch(AssertionError ex) {
				System.out.println("testNullDateThrows - message content failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testNullDateThrows - message content failed - Exception");
				System.out.println(ex);
			}
		}
	}

	private static void testPm25BelowMinThrows() {
		try {
			new AirQualityReading("S001", "North", LocalDate.of(2026, 2, 1), -0.01);
			System.out.println("testPm25BelowMinThrows failed - No exception thrown");
			System.out.println("Expected AirQualityDataException for temperature below 0.0");
		} catch (AirQualityDataException e) {
			try {
				assert e.getMessage().contains("Invalid PM2.5")
						: "Message should mention Invalid PM2.5. Actual: " + e.getMessage();
				System.out.println("testPm25BelowMinThrows passed");
				score+=10;
			} catch(AssertionError ex) {
				System.out.println("testPm25BelowMinThrows failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testPm25BelowMinThrows failed - Exception");
				System.out.println(ex);
			}
		}
	}

	private static void testPm25AboveMaxThrows() {
		try {
			new AirQualityReading("S001", "North", LocalDate.of(2026, 2, 1), 500.01);
			System.out.println("testPm25AboveMaxThrows failed - No exception thrown");
			System.out.println("Expected AirQualityDataException for temperature above 500.0");
		} catch (AirQualityDataException e) {
			try {
				assert e.getMessage().contains("Invalid PM2.5")
						: "Message should mention Invalid PM2.5. Actual: " + e.getMessage();
				System.out.println("testPm25AboveMaxThrows passed");
				score+=10;
			} catch(AssertionError ex) {
				System.out.println("testPm25AboveMaxThrows failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testPm25AboveMaxThrows failed - Exception");
				System.out.println(ex);
			}
		}
	}

	private static void testBoundaryPm25Allowed() {
		try {
			AirQualityReading low = new AirQualityReading("S001", "North", LocalDate.of(2026, 2, 1), 0.0);
			AirQualityReading high = new AirQualityReading("S002", "South", LocalDate.of(2026, 2, 1), 500.0);

			try {
				assert Math.abs(low.getPm25() - 0.0) < 1e-9 : "Boundary 0.0 should be allowed";
				System.out.println("testBoundaryPm25Allowed - low boundary passed");
				score+=10;
			} catch(AssertionError ex) {
				System.out.println("testBoundaryPm25Allowed - low boundary failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testBoundaryPm25Allowed - low boundary failed - Exception");
				System.out.println(ex);
			}

			try {
				assert Math.abs(high.getPm25() - 500.0) < 1e-9 : "Boundary 500.0 should be allowed";
				System.out.println("testBoundaryPm25Allowed - high boundary passed");
				score+=10;
			} catch(AssertionError ex) {
				System.out.println("testBoundaryPm25Allowed - high boundary failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testBoundaryPm25Allowed - high boundary failed - Exception");
				System.out.println(ex);
			}
		} catch (AirQualityDataException e) {
			System.out.println("testBoundaryPm25Allowed failed - AirQualityDataException");
			System.out.println("Boundary PM2.5 values should not throw: " + e.getMessage());
		}
	}

	private static void testEqualsSameSensorIdSameDateTrue() {
		try {
			LocalDate date = LocalDate.of(2026, 2, 5);
			AirQualityReading a = new AirQualityReading("S001", "North", date, 20.0);
			AirQualityReading b = new AirQualityReading("S001", "South", date, 30.0); // district/pm25 differs

			try {
				assert a.equals(b) : "equals should be true when sensorId and date match";
				System.out.println("testEqualsSameSensorIdSameDateTrue - a.equals(b) passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testEqualsSameSensorIdSameDateTrue - a.equals(b) failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testEqualsSameSensorIdSameDateTrue - a.equals(b) failed - Exception");
				System.out.println(ex);
			}

			try {
				assert b.equals(a) : "equals should be symmetric";
				System.out.println("testEqualsSameSensorIdSameDateTrue - b.equals(a) passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testEqualsSameSensorIdSameDateTrue - b.equals(a) failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testEqualsSameSensorIdSameDateTrue - b.equals(a) failed - Exception");
				System.out.println(ex);
			}
		} catch (AirQualityDataException e) {
			System.out.println("testEqualsSameSensorIdSameDateTrue failed - AirQualityDataException");
			System.out.println("Should not throw for valid readings: " + e.getMessage());
		}
	}

	private static void testEqualsSameSensorIdDifferentDateFalse() {
		try {
			AirQualityReading a = new AirQualityReading("S001", "North", LocalDate.of(2026, 2, 5), 20.0);
			AirQualityReading b = new AirQualityReading("S001", "North", LocalDate.of(2026, 2, 6), 20.0);

			try {
				assert !a.equals(b) : "equals should be false when dates differ";
				System.out.println("testEqualsSameSensorIdDifferentDateFalse passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testEqualsSameSensorIdDifferentDateFalse failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testEqualsSameSensorIdDifferentDateFalse failed - Exception");
				System.out.println(ex);
			}
		} catch (AirQualityDataException e) {
			System.out.println("testEqualsSameSensorIdDifferentDateFalse failed - AirQualityDataException");
			System.out.println("Should not throw for valid readings: " + e.getMessage());
		}
	}

	private static void testEqualsDifferentSensorIdSameDateFalse() {
		try {
			LocalDate date = LocalDate.of(2026, 2, 5);
			AirQualityReading a = new AirQualityReading("S001", "North", date, 20.0);
			AirQualityReading b = new AirQualityReading("S002", "North", date, 20.0);

			try {
				assert !a.equals(b) : "equals should be false when sensorIds differ";
				System.out.println("testEqualsDifferentSensorIdSameDateFalse passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testEqualsDifferentSensorIdSameDateFalse failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testEqualsDifferentSensorIdSameDateFalse failed - Exception");
				System.out.println(ex);
			}
		} catch (AirQualityDataException e) {
			System.out.println("testEqualsDifferentSensorIdSameDateFalse failed - AirQualityDataException");
			System.out.println("Should not throw for valid readings: " + e.getMessage());
		}
	}

	private static void testEqualsNullAndDifferentTypeFalse() {
		try {
			AirQualityReading reading = new AirQualityReading("S001", "North", LocalDate.of(2026, 2, 5), 20.0);

			try {
				assert !reading.equals(null) : "equals should be false for null";
				System.out.println("testEqualsNullAndDifferentTypeFalse - null check passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testEqualsNullAndDifferentTypeFalse - null check failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testEqualsNullAndDifferentTypeFalse - null check failed - Exception");
				System.out.println(ex);
			}

			try {
				assert !reading.equals("not an AirQualityReading") : "equals should be false for different type";
				System.out.println("testEqualsNullAndDifferentTypeFalse - type check passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testEqualsNullAndDifferentTypeFalse - type check failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testEqualsNullAndDifferentTypeFalse - type check failed - Exception");
				System.out.println(ex);
			}
		} catch (AirQualityDataException e) {
			System.out.println("testEqualsNullAndDifferentTypeFalse failed - AirQualityDataException");
			System.out.println("Should not throw for valid readings: " + e.getMessage());
		}
	}

	private static void testToStringContainsFields() {
		try {
			AirQualityReading reading = new AirQualityReading("S001", "North", LocalDate.of(2026, 2, 5), 35.2);
			String s = reading.toString();

			try {
				assert s.contains("S001") : "toString should contain sensorId";
				System.out.println("testToStringContainsFields - sensorId passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testToStringContainsFields - sensorId failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testToStringContainsFields - sensorId failed - Exception");
				System.out.println(ex);
			}

			try {
				assert s.contains("North") : "toString should contain district";
				System.out.println("testToStringContainsFields - district passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testToStringContainsFields - district failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testToStringContainsFields - district failed - Exception");
				System.out.println(ex);
			}

			try {
				assert s.contains("2026-02-05") : "toString should contain date";
				System.out.println("testToStringContainsFields - date passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testToStringContainsFields - date failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testToStringContainsFields - date failed - Exception");
				System.out.println(ex);
			}

			try {
				assert s.contains("35.2") : "toString should contain pm25";
				System.out.println("testToStringContainsFields - pm25 passed");
				score+=1;
			} catch(AssertionError ex) {
				System.out.println("testToStringContainsFields - pm25 failed - AssertionError");
				System.out.println(ex);
			} catch(Exception ex) {
				System.out.println("testToStringContainsFields - pm25 failed - Exception");
				System.out.println(ex);
			}
		} catch (AirQualityDataException e) {
			System.out.println("testToStringContainsFields failed - AirQualityDataException");
			System.out.println("Should not throw for valid readings: " + e.getMessage());
		}
	}
}
