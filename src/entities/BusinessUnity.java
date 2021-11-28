package entities;

import java.util.List;

/*
 * -> Heran�a: Nosso projeto tem classes m�e(superclasse) e filhas(subclasse).
		Ex.: Entidade "Unity" e suas filhas "BusinessUnity" e "BackOffice
		linha 11
 */

public class BusinessUnity extends Unity{

	

	private Integer size;
	
	
	
	
	
	public BusinessUnity() {
		super();
	}
	
	




	public BusinessUnity(Integer branch, String name) {
		super(branch, name);
	}






	public BusinessUnity(Integer branch, String name, String companiesHouseId, String email, String phone, UnityPremises premises, Integer size) {
		super(branch, name, companiesHouseId, email, phone, premises);
		this.size = size;
	}
	
	
	

	public BusinessUnity(Integer branch, String name, String companiesHouseId, String email, String phone,
			List<Employee> employees, List<ExpenditureCharge> expenditure,
			List<MonthlyUnityExpenditure> monthlyExpenditure) {
		super(branch, name, companiesHouseId, email, phone, employees, expenditure, monthlyExpenditure);
	}




	public BusinessUnity(Integer branch, String name, String companiesHouseId, String email, String phone,
			UnityPremises premises) {
		super(branch, name, companiesHouseId, email, phone, premises);
	}




	public BusinessUnity(Integer branch, String name, String companiesHouseId, String email, String phone, Integer size) {
		super(branch, name, companiesHouseId, email, phone);
		this.size = size;
		}




	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}




	@Override
	public Double calaculateSalaryCost() {
		double total = 0.0;
		for(Employee y : this.getEmployees())
			if(y.getCurrentSalary() != null)
				total += y.getCurrentSalary();
		
		return total;
	}

		
}
