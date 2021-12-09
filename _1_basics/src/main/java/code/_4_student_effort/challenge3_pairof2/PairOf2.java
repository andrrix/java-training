package code._4_student_effort.challenge3_pairof2;

public class PairOf2 {
    public static Integer pairOf2(Integer[] numbers) {
        Integer perechi = 0;
        Integer[] indexDeNumereRegasiteInPerechi = new Integer[numbers.length];
        int pozitiaVectoruluiDeIndexi = 0;
        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = i + 1; j < numbers.length; j++) {
                boolean isActive = false;
                for (int k = 0; k < pozitiaVectoruluiDeIndexi; k++)
                    if (indexDeNumereRegasiteInPerechi[k] == i || indexDeNumereRegasiteInPerechi[k] == j)
                        isActive = true;
                if (!isActive & (numbers[i] + numbers[j] == 0)) {
                    indexDeNumereRegasiteInPerechi[pozitiaVectoruluiDeIndexi++] = i;
                    indexDeNumereRegasiteInPerechi[pozitiaVectoruluiDeIndexi++] = j;
                    perechi++;
                    break;
                }
            }
        return perechi;
    }
}
