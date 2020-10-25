package workers_2;

public class CompanyDemo {
    public static void main(String[] args) {
        HourlyWorker tom = new HourlyWorker("Tom","Black","12313123",2000);
        HourlyWorker alex = new HourlyWorker("Tom","Black","12313123",2000);
        HourlyWorker ken = new HourlyWorker("Tom","Black","12313123",2000);
        HourlyWorker joy = new HourlyWorker("Tom","Black","12313123",2000);
        HourlyWorker ann = new HourlyWorker("Tom","Black","12313123",2000);

        SalaryWorker lex = new SalaryWorker("Lex","White","343434",150000);
        SalaryWorker jey = new SalaryWorker("Lex","White","343434",150000);
        SalaryWorker stan = new SalaryWorker("Lex","White","343434",150000);

        Company company = new Company(new Worker[]{tom, lex, alex, jey, ken, stan, joy, ann});
        System.out.println(company.countWorkers());
    }
}
