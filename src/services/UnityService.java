package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Address;
import entities.BusinessUnity;
import entities.Unity;
import entities.UnityPremises;

public class UnityService {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private List<Unity> unity = new ArrayList<>();
	
	private Unity dao = new BusinessUnity();
	
	public List<Unity> findAll() throws ParseException{
		
		unity.add(new BusinessUnity(1, "Bel�m", "01492745000114", "r01@tacaca.com.br", "91953059830", new UnityPremises(1, 1, (Date) sdf.parse("27/05/2004"), (Date) sdf.parse("31/12/2100"), "A", new Address("Rua Jos� Fialho", "927", "Nazar�", "Bel�m", "PA", "66095-225")), 1));
		unity.add(new BusinessUnity(3, "Santar�m", "01492745000330", "r03@tacaca.com.br", "91927934920", new UnityPremises(3, 3, (Date) sdf.parse("04/01/2005"), (Date) sdf.parse("31/12/2100"), "A", new Address("Avenida Bel�m", "458", "Centro", "Santar�m", "PA", "66095-225")), 1));
		unity.add(new BusinessUnity(4, "Marab�", "01492745000427", "r04@tacaca.com.br", "91920827320", new UnityPremises(4, 4, (Date) sdf.parse("25/04/2005"), (Date) sdf.parse("31/12/2100"), "A", new Address("Rua Santar�m", "934", "Centro", "Marab�", "PA", "66095-030")), 1));
		unity.add(new BusinessUnity(5, "Parauapebas", "01492745000520", "r05@tacaca.com.br", "91920079315", new UnityPremises(5, 5, (Date) sdf.parse("14/08/2005"), (Date) sdf.parse("31/12/2100"), "A", new Address("Avenida Santar�m", "827", "Centro", "Parauapebas", "PA", "66095-030")), 1));
		unity.add(new BusinessUnity(6, "Castanhal", "01492745000620", "r06@tacaca.com.br", "91915908013", new UnityPremises(6, 6, (Date) sdf.parse("03/12/2005"), (Date) sdf.parse("31/12/2100"), "A", new Address("Rua Parauapebas", "079", "Centro", "Castanhal", "PA", "66095-030")), 1));
		unity.add(new BusinessUnity(7, "Abaetetuba", "01492745000715", "r07@tacaca.com.br", "91913936413", new UnityPremises(7, 7, (Date) sdf.parse("24/03/2006"), (Date) sdf.parse("31/12/2100"), "A", new Address("Avenida Parauapebas", "908", "Centro", "Abaetetuba", "PA", "66095-020")), 1));
		unity.add(new BusinessUnity(8, "Camet�", "01492745000813", "r08@tacaca.com.br", "91913368513", new UnityPremises(8, 8, (Date) sdf.parse("13/07/2006"), (Date) sdf.parse("31/12/2100"), "A", new Address("Rua Abaetetuba", "936", "Centro", "Camet�", "PA", "66095-020")), 1));
		unity.add(new BusinessUnity(9, "Marituba", "01492745000913", "r09@tacaca.com.br", "91913213812", new UnityPremises(9, 9, (Date) sdf.parse("01/11/2006"), (Date) sdf.parse("31/12/2100"), "A", new Address("Avenida Abaetetuba", "368", "Centro", "Marituba", "PA", "66095-020")), 1));
		unity.add(new BusinessUnity(11, "S�o F�lix do Xingu", "01492745001113", "r11@tacaca.com.br", "91912891412", new UnityPremises(10, 11, (Date) sdf.parse("20/02/2007"), (Date) sdf.parse("31/12/2100"), "A", new Address("Rua Marituba", "213", "Centro", "S�o F�lix do Xingu", "PA", "66095-010")), 1));
		unity.add(new BusinessUnity(10, "Bragan�a", "01492745001012", "r10@tacaca.com.br", "91912702711", new UnityPremises(11, 10, (Date) sdf.parse("11/06/2007"), (Date) sdf.parse("31/12/2100"), "A", new Address("Avenida Marituba", "891", "Centro", "Bragan�a", "PA", "66095-010")), 1));
		
		return unity;
	}
	
	
	public List<Unity> getList(){
		return unity;
	}

	public void saveOrUpdate(Unity obj) throws ParseException {
			unity.add(obj);
	}

}
