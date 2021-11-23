package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import utilities.SalaryCost;

public abstract class Unity implements SalaryCost{
	/* 
	 * 	-> Encapsulamento: Todas as classes do nosso projeto est�o devidamente protegidas.
	 *		Ex.: Atributos no private e acessados atrav�s de getters, setters e constructors.
	 *		linha: 15, 16, 17, 18, 19....
	 */
	private Integer branch;
	private String name;
	private String companiesHouseId;
	private String email;
	private String phone;
	private UnityPremises premises;
	private List<Employee> employees = new ArrayList<>(); 
	private List<ExpenditureCharge> expenditure = new ArrayList<>();
	private List<MonthlyUnityExpenditure> monthlyExpenditure = new ArrayList<>();
	
	

	/*
	 * 
		-> Polimorfismo: � poss�vel encontrar o conceito de polimorfismo em todo o nosso projeto.
			Ex.: Sobrecarga de construtores, m�todo toString e o m�todo calculateSalaryCost da interface SalaryCost.
			linha 187 (toString)
	 */
	
	

	public Unity(Integer branch, String name, String companiesHouseId, String email, String phone,
			UnityPremises premises) {
		this.branch = branch;
		this.name = name;
		this.companiesHouseId = companiesHouseId;
		this.email = email;
		this.phone = phone;
		this.premises = premises;
	}



	public Unity(Integer branch, String name, String companiesHouseId, String email, String phone,
			List<Employee> employees, List<ExpenditureCharge> expenditure,
			List<MonthlyUnityExpenditure> monthlyExpenditure) {
		this.branch = branch;
		this.name = name;
		this.companiesHouseId = companiesHouseId;
		this.email = email;
		this.phone = phone;
		this.employees = employees;
		this.expenditure = expenditure;
		this.monthlyExpenditure = monthlyExpenditure;
	}


	
	public Unity(Integer branch, String name, String companiesHouseId, String email, String phone) {
		this.branch = branch;
		this.name = name;
		this.companiesHouseId = companiesHouseId;
		this.email = email;
		this.phone = phone;
	}





	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public UnityPremises getPremises() {
		return premises;
	}

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	public void setPremises(UnityPremises premises) {
		this.premises = premises;
	}

	public Integer getBranch() {
		return branch;
	}

	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompaniesHouseId() {
		return companiesHouseId;
	}

	public void setCompaniesHouseId(String taxPayerIdNumber) {
		this.companiesHouseId = taxPayerIdNumber;
	}
	
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void printUnits(ArrayList<Unity> unity) {
		
	}
	
	public void addUnity(Unity unity) {
		
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void addExpenditure(ExpenditureCharge expenditure) {
		this.expenditure.add(expenditure);
	}



	public List<ExpenditureCharge> getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(List<ExpenditureCharge> expenditure) {
		this.expenditure = expenditure;
	}
	

	
	public List<MonthlyUnityExpenditure> getMonthlyExpenditure() {
		return monthlyExpenditure;
	}



	public void setMonthlyExpenditure(List<MonthlyUnityExpenditure> monthlyExpenditure) {
		this.monthlyExpenditure = monthlyExpenditure;
	}



	public void addMonthlyUnityExpenditure(MonthlyUnityExpenditure expenditure) {
		monthlyExpenditure.add(expenditure);
	}
	
	public Integer employeeAmount() {
		return this.getEmployees().size();
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Branch: " + branch + "\n"
				+ "Name: " + name + "\n" + "Opening date: " + sdf.format(this.premises.getOpeningDate()) + "\n"
				+ "Employee amount: " + this.employeeAmount();
	}
}
