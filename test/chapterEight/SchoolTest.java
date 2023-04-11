package chapterEight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SchoolTest {


    @Test
    public void universityTest(){
        School[] schools = School.values();
        for (School school : schools){
            System.out.println(Arrays.toString(School.values()));
        }
    }
}