public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Харитонов Всеволод Романович", 1, 100000);
        employees[1] = new Employee("Иванов Али Эминович", 2, 160000);
        employees[2] = new Employee("Зайцева Александра Степановна", 3, 150000);
        employees[3] = new Employee("Винокурова Сoфия Фёдоровна", 4, 190000);
        employees[4] = new Employee("Соколова Екатерина Богдановна", 5, 200000);
        employees[5] = new Employee("Карасева Варвара Александровна", 1, 160000);
        employees[6] = new Employee("Лобанова Валерия Артёмовна", 2, 180000);
        employees[7] = new Employee("Никифоров Алексей Владимирович", 3, 190000);
        employees[8] = new Employee("Федоров Фёдор Леонидович", 4, 200000);
        employees[9] = new Employee("Клюев Тимофей Олегович", 5, 210000);

        printEmployees(employees);
        int salarySum = calculateSalarySum(employees);
        System.out.println("Сумма зарплат = " + salarySum);

        Employee employeeWithMinSalary = findEmployeeWithMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой = " + employeeWithMinSalary);

        Employee employeeWithMaxSalary = findEmployeeWithMaxSalarySalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой = " + employeeWithMaxSalary);

        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Средняя зарплата = " + averageSalary);

        printFullNames(employees);

    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateSalarySum(Employee[] employees) {
        int totalSalarySum = 0;
        for (Employee employee : employees) {
            totalSalarySum += employee.getSalary();
        }
        return totalSalarySum;
    }

    private static Employee findEmployeeWithMinSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[index].getSalary()) {
                index = i;
            }
        }
        return employees[index];
    }

    private static Employee findEmployeeWithMaxSalarySalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[index].getSalary()) {
                index = i;
            }
        }
        return employees [index];
    }

        private static double calculateAverageSalary(Employee[] employees) {
        int salarySum = calculateSalarySum(employees);
        double averageSum = (double) salarySum / employees.length;
                return (double) averageSum;
    }

    private static void printFullNames(Employee[] employees) {
        System.out.println("Ф.И.О. всех сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}


