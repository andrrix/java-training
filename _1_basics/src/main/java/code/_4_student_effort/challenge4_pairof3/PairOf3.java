package code._4_student_effort.challenge4_pairof3;

public class PairOf3 {
    public static Integer pairOf3(Integer[] numbers) {
        Integer perechi = 0;
        Integer[] indexDeNumereRegasiteInPerechi = new Integer[numbers.length];
        int pozitiaVectoruluiDeIndexi = 0;
        for (int i = 0; i < numbers.length - 2; i++)
            for (int j = i + 1; j < numbers.length-1; j++)
                for (int z = i + 2; z < numbers.length; z++) {
                boolean isActive = false;
                for (int k = 0; k < pozitiaVectoruluiDeIndexi; k++)
                    if (indexDeNumereRegasiteInPerechi[k] == i || indexDeNumereRegasiteInPerechi[k] == j || indexDeNumereRegasiteInPerechi[k] == z)
                        isActive = true;
                if (!isActive & (numbers[i] + numbers[j] + numbers[z] == 0)) {
                    indexDeNumereRegasiteInPerechi[pozitiaVectoruluiDeIndexi++] = i;
                    indexDeNumereRegasiteInPerechi[pozitiaVectoruluiDeIndexi++] = j;
                    indexDeNumereRegasiteInPerechi[pozitiaVectoruluiDeIndexi++] = z;
                    perechi++;
                    break;
                }
            }
        return perechi;
    }
}
