package test20240328_takadera;

import java.util.Scanner;

public class Subject2 {

    public static void main(String[] args) {
        // ルールを出力
        System.out.println("課題２：有効なパスワードのチェックプログラム");
        System.out.println("パスワードのルール：");
        System.out.println("- パスワードは8文字以上でなければなりません。");
        System.out.println("- パスワードは文字と数字のみで構成される必要があります。");
        System.out.println("- パスワードには少なくとも3桁の数字が含まれていなければなりません。");

        // ユーザーにパスワードの入力を促す
        Scanner scanner = new Scanner(System.in);
        System.out.print("パスワードを入力してください：");
        String password = scanner.nextLine();

        // パスワードが有効かどうかをチェックして結果を出力
        if (isValidPassword(password)) {
            System.out.println("パスワードは有効です：" + password);
        } else {
            System.out.println("パスワードは無効です：" + password);
        }
    }

    // パスワードが有効かどうかをチェックするメソッド
    public static boolean isValidPassword(String password) {
        // パスワードの長さが8文字以上かどうかをチェック
        if (password.length() < 8) {
            return false;
        }

        // パスワードが文字と数字のみで構成されているかどうかをチェック
        if (!password.matches("[a-zA-Z0-9]+")) {
            return false;
        }

        // パスワードに少なくとも3桁の数字が含まれているかどうかをチェック
        if (!password.matches(".*\\d{3,}.*")) {
            return false;
        }

        return true;
    }
}
