package pl.sdacademy.lottery.model;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Admin on 27.04.2017.
 */

public class Coupon {
    public static final int ID_LENGTH=8;
    public static final int NUMBERS_COUNT=6;
    public static final int NUMBERS_MIN=1;
    public static final int NUMBERS_MAX=49;

    int id;
    int[] numbers;

    public Coupon(int id, int[] numbers){
        validateId(id);
        this.id = id;
        validateNumbers(numbers);
        this.numbers = numbers;
    }


    public void validateId(int id){
        if(id<0){
            throw new InvalidParameterException("Coupon cannot be negative.");
        }
        if(Integer.toString(id).length()!=ID_LENGTH){
            throw new InvalidParameterException(
                    String.format("Coupon id must have %d digits.",ID_LENGTH));
        }
    }

    public void validateNumbers(int[] numbers){
        Set<Integer> set = new LinkedHashSet<Integer>();
        for(int number : numbers){
            set.add(number);
        }
        if(numbers.length != NUMBERS_COUNT || set.size()!=NUMBERS_COUNT){
            throw new InvalidParameterException(
                String.format("Coupon must have array of %d unique numbers.",NUMBERS_COUNT));
        }
        for(int number : numbers){
            if( number < NUMBERS_MIN || number > NUMBERS_MAX){
                throw new InvalidParameterException(
                        String.format("Number must be beetwen %d and %d, found = %d",
                        NUMBERS_MIN, NUMBERS_MAX,number)
                );
            }
        }
    }

    public int getId() {
        return id;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
