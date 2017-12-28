package com.gera.javacore;

/**
 * @author Andrii Gerasymchuk
 * @version 0.1.0
 * User: Gera
 * Date: 26.12.17
 * Time: 18:08
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeChapter2 {
    /**
     * Amount of days in year
     */
    public static final short DAYS_PER_YEAR = 365;
    private String name;
    private double salary;
    /**
     * Raise a salary of en employee
     * @since version 0.1.0
     * @param byPercent - magnitude of salary increase
     * @return raised salary value
     */
    public double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        return salary;
    }

    /**
     * @deprecated use getName() instead of getNameOld()
     */
    public String getNameOld() {
        return name;
    }

    /**
     * Here we check how 'see' works
     * @see com.gera.javacore.TestJar#TestJar(String)
     * Let's check URL:
     * @see <a href="https://www.geeksforgeeks.org/medium">link description</a>
     * */
    public String getName() {
        return name;
    }
}
