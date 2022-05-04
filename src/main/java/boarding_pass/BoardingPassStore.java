/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: BoardingPassStore - store and retrieve boarding pass
 */
package boarding_pass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class BoardingPassStore {
    public static final Path allBoardingPassFilePath = Paths.get(System.getProperty("user.dir")+"\\src\\main\\resources\\allBoardingPass.txt");
    public static final Path oneBoardingPassFilePath = Paths.get(System.getProperty("user.dir")+"\\src\\main\\resources\\oneBoardingPass.txt");

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
        fileContent = fileContent+"#"+newfileContent;
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
        try {
            if (Files.exists(filePath)) {
                List<String> boardingPassLst = Arrays.asList(Files.readString(filePath).split("#"));
                for (String boardingPass: boardingPassLst) {
                    List<String> boardingPassPropLst = Arrays.asList(boardingPass.split(","));
                    if (boardingPassPropLst.get(1).equals(String.valueOf(boardingPassNum))) {
                        retStr=boardingPass;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            retStr = "";
        } finally {
            return retStr;
        }
    }
}
