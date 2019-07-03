public class StudentGrade {
    public String checkgrade(double[] grades) {
        int len = grades.length;
        for (int i = 0; i < len; i++) {
            try {
                if (grades[i] > 100 || grades[i] < 0) {//checks ifgrades are between 1 to 100
                    throw new Exception("Not Between 1 to 100");
                }

            } catch (Exception e) {
                return e.getMessage();
            }
        }
        return "Passed";
    }
}

