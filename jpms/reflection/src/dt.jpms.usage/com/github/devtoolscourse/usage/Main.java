package com.github.devtoolscourse.usage;
import com.github.devtoolscourse.member.Member;

import module java.base;

public class Main {
    private static void readField(Field field) {
        try {
            field.setAccessible(true);
            System.out.println(field.get(null));
        } catch (IllegalAccessException | InaccessibleObjectException e) {
            System.out.printf("CANNOT READ FIELD %s%n", field.getName());;
        }
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Class<Member> open = Member.class;

        readField(open.getDeclaredField("pub"));
        readField(open.getDeclaredField("prot"));
        readField(open.getDeclaredField("packpriv"));
        readField(open.getDeclaredField("priv"));
    }
}
