class Employee {
    String firstName;
    String lastName;
    String Cnic;

    public Employee() {
        firstName = "Sahil";
        lastName = "Kumar";
        Cnic = "44302-7268282-8";
    }

    public Employee(String firstName, String lastName, String Cnic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Cnic = Cnic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCnic() {
        return Cnic;
    }

    public void setCnic(String Cnic) {
        this.Cnic = Cnic;
    }

    public String toString() {
        return firstName + " " + lastName + " CNIC# " + Cnic;
    }

    public double earnings() {
        return 0.00;
    }
}

class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee() {
        super();
        weeklySalary = 10000.50;
    }

    public SalariedEmployee(String firstName, String lastName, String Cnic, double weeklySalary) {
        super(firstName, lastName, Cnic);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public String toString() {
        return "\nSalaried employee: " + super.toString();
    }

    public double earnings() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    double wages;
    double hours;

    public HourlyEmployee() {
        wages = 5.4;
        hours = 3.5;
    }

    public HourlyEmployee(String firstName, String lastName, String Cnic, double wages, double hours) {
        super(firstName, lastName, Cnic);
        this.wages = wages;
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {
        return "\nHourly employee: " + super.toString();
    }

    public double earnings() {
        if (hours <= 40) {
            return wages * hours;
        } else {
            return 40 * wages + (hours - 40) * wages * 1.5;
        }
    }
}

class CommissionEmployee extends Employee {
    double grossSales;
    double commissionRate;

    public CommissionEmployee() {
        grossSales = 835.37;
        commissionRate = 5.5;
    }

    public CommissionEmployee(String firstName, String lastName, String Cnic, double grossSales, double commissionRate) {
        super(firstName, lastName, Cnic);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }


    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String toString() {
        return "\nCommission employee: " + super.toString();
    }

    public double earnings() {
        return grossSales * commissionRate;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    public BasePlusCommissionEmployee() {
        baseSalary = 20000.0;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String Cnic, double baseSalary) {
        super(firstName, lastName, Cnic, 0, 0); // Passing default values for grossSales and commissionRate
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String toString() {
        return "\nBase plus Commission employee: " + super.toString();
    }

    public double earnings() {
        return baseSalary + super.earnings();
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Employee firstEmployee = new SalariedEmployee("Muhammad", "Ali", "11111-1111", 800.00);

        Employee secondEmployee = new CommissionEmployee("Tarwan", "Kumar", "222-22-2222", 10000, 0.06);

        Employee thirdEmployee = new BasePlusCommissionEmployee("Fabeeha", "Fatima", "333-33-3333", 5000);

        Employee fourthEmployee = new HourlyEmployee("Hasnain", "Ali", "444-44-4444", 16.75, 40);

        System.out.println(firstEmployee);

        System.out.println("Earnings: " + firstEmployee.earnings());

        System.out.println(secondEmployee);
        System.out.println("Earnings: " + secondEmployee.earnings());

        System.out.println(thirdEmployee);

        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee;

        double oldBaseSalary = currentEmployee.getBaseSalary();

        System.out.println("Old base salary: " + oldBaseSalary);

        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);

        System.out.println("New base salary with 10% increase is: " + currentEmployee.getBaseSalary());

        System.out.println("Earnings: " + thirdEmployee.earnings());

        System.out.println(fourthEmployee);

        System.out.println("Earnings: " + fourthEmployee.earnings());
    }
}
