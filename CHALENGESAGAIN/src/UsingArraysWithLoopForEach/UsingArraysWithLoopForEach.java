package UsingArraysWithLoopForEach;

import javax.swing.*;

public class UsingArraysWithLoopForEach {
    public static void main(String[] args) {

        int numberOfGrades = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas do aluno você deseja pegar?"));
        int[] arrayOfGrades = new int[numberOfGrades];
        int sum = 0;
        int iterators = 0;
        int average;

        for (int i = 0; i < numberOfGrades; i++) {
            int gradeOfTime = Integer.parseInt(JOptionPane.showInputDialog(String.format("Qual a %d nota?", (i + 1))));
            arrayOfGrades[i] = gradeOfTime;
        }

        for (int grade: arrayOfGrades) {
            sum += grade;
            iterators++;
        }

        average = sum / iterators;

        JOptionPane.showMessageDialog(null, String.format("A média da nota do aluno é %d", average));
        System.out.println(average);

        System.exit(0);

    }

}
