package task4.ws;

import task4.ws.customExceptions.InvalidDataException;
import task4.ws.customExceptions.InvalidTokenException;
import task4.ws.customExceptions.ParseException;

import java.net.URI;
import java.nio.file.FileSystemException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Main().multiStepMethod());
    }

    Result multiStepMethod() {

        try {
            Helper.validateToken("password");
            Helper.validateData("some data or jsonString");
            List<String> paths = Helper.parseSomeData();
            for (String path : paths) {
                URI uri = Helper.createResources(path);
                // кокая-то логика работы с адресами
            }

        } catch (InvalidTokenException e) {
            System.out.println("логируем ошибку");
            return Result.BAD_REQUEST;
        } catch (InvalidDataException e) {
            System.out.println("логируем ошибку");
            return Result.BAD_REQUEST;
        } catch (FileSystemException e) {
            System.out.println("логируем ошибку");
            return Result.INTERNAL_ERROR;
        } catch (ParseException e) {
            System.out.println("логируем ошибку");
            return Result.INTERNAL_ERROR;
        }

        return Result.ACKNOWLEDGE;
    }

    public static enum Result {
        ACKNOWLEDGE, BAD_REQUEST, INTERNAL_ERROR
    }
}
