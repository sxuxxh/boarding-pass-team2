/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: BoardingPassStore - store and retrieve boarding pass
 */
package boarding_pass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class BoardingPassStore {
    //Method: create file
    public static void createFile(Path filePath) {
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Method: write a boarding pass
    public static void writeABoardingPass(Path filePath, String newfileContent) {
        String fileContent = readBoardingPasses(filePath);
        if (!fileContent.isEmpty()) {
            fileContent = fileContent + "#" + newfileContent;
        } else {
            fileContent = newfileContent;
        }
        try {
            if (Files.exists(filePath)) {
                Files.writeString(filePath, fileContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Method: write a file for boarding pass presentation
    public static void writePresentFile(Path filePath, String fileContent) {
        try {
            if (Files.exists(filePath)) {
                Files.writeString(filePath, fileContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Method: read boarding passes
    public static String readBoardingPasses(Path filePath) {
        var retStr = "";
        try {
            if (Files.exists(filePath)) {
                retStr = Files.readString(filePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
            retStr = "";
        } finally {
            return retStr;
        }
    }

    //Method: read a boarding pass
    public static String readABoardingPass(Path filePath, int boardingPassNum) {
        String retStr="";
        if (Files.exists(filePath)) {
            List<String> boardingPassLst = Arrays.asList(readBoardingPasses(filePath).split("#"));
            retStr= boardingPassLst.stream()
                    .filter(boardingPass -> Integer.parseInt(Arrays.asList(boardingPass.split(",")).get(0))==boardingPassNum)
                    .collect(Collectors.joining());
        }
        return retStr;
    }

    // Method: present a boarding pass nicely
    public static String presentABoardingPass(String boardingPassStr) {
        String boardingPassPresentStr = "**********************************************************\n" +
                                        "***********    Boarding Pass Ticket Station    ***********\n" +
                                        "  Boarding Pass No.: %s                                   \n" +
                                        "  Passenger Name: %s                                      \n" +
                                        "  Passenger Age: %s  \tGender: %s                         \n" +
                                        "  Passenger Email: %s  \tPhone#: %s                       \n" +
                                        "  Trip(Origin_Destination): %s                            \n" +
                                        "  Departure DateTime: %s                                  \n" +
                                        "  Estimated Arrival DateTime: %s                          \n" +
                                        "  Total Price: %s                                         \n" +
                                        "**********************************************************\n";
        List<String> boardingPassPropLst = Arrays.asList(boardingPassStr.split(","));
        return String.format(boardingPassPresentStr,
                boardingPassPropLst.get(0),
                boardingPassPropLst.get(1),
                boardingPassPropLst.get(2),
                boardingPassPropLst.get(4),
                boardingPassPropLst.get(3),
                boardingPassPropLst.get(5),
                boardingPassPropLst.get(6),
                boardingPassPropLst.get(7),
                boardingPassPropLst.get(8),
                boardingPassPropLst.get(9));
    }

    // Method: create a unique boarding pass number
    public static int createBoardingPassNum(Path filePath) {
        int boardingPassNum=1;
        Set<Integer> boardingPassNums = new LinkedHashSet<>();
        try {
            if (Files.exists(filePath) && Files.size(filePath)>0) {
                List<String> boardingPassLst = Arrays.asList(readBoardingPasses(filePath).split("#"));
                if (boardingPassLst.size()>0 && boardingPassLst!=null) {
                    for (String boardingPass : boardingPassLst) {
                        List<String> boardingPassPropLst = Arrays.asList(boardingPass.split(","));
                        boardingPassNums.add(Integer.parseInt(boardingPassPropLst.get(0)));
                    }
                    for (int num: boardingPassNums) {
                        boardingPassNum=num;
                    }
                    while (!boardingPassNums.add(boardingPassNum)) {
                        boardingPassNum += 1;
                    }
                } else {
                    boardingPassNum=1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return boardingPassNum;
    }
}
