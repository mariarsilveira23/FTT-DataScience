import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DataScienceMain {
	public static void main(String[] args) {
		File file = new File("TechCrunchcontinentalUSA.csv");

		List<Startup> arrStartup = new ArrayList<Startup>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String registro;
			int cont = 1;
			int contRegistros = 1;

			while ((registro = br.readLine()) != null) {
				if (cont > 1) {
					Startup st = new Startup();
					String[] arrayRegistros = registro.split(",");

					if (arrayRegistros[0].length() > 0)
						st.setPermalink(arrayRegistros[0]);
					if (arrayRegistros[1].length() > 0)
						st.setCompany(arrayRegistros[1]);
					if (arrayRegistros[2].length() > 0)
						st.setNumEmps(arrayRegistros[2]);
					if (arrayRegistros[3].length() > 0)
						st.setCategory(arrayRegistros[3]);
					if (arrayRegistros[4].length() > 0)
						st.setCity(arrayRegistros[4]);
					if (arrayRegistros[5].length() > 0)
						st.setState(arrayRegistros[5]);
					if (arrayRegistros[6].length() > 0)
						st.setFundedDate(arrayRegistros[6]);
					if (arrayRegistros[7].length() > 0)
						st.setRaisedAmt(arrayRegistros[7]);
					if (arrayRegistros[8].length() > 0)
						st.setRaisedCurrency(arrayRegistros[8]);
					if (arrayRegistros[9].length() > 0)
						st.setRound(arrayRegistros[9]);

					exibeStartup(st, contRegistros);
					contRegistros++;

					arrStartup.add(st);

				}

				cont++;

			}
		} catch (Exception e) {

			e.printStackTrace();

		}

		exibeDados(arrStartup);
	}

	public static void exibeStartup(Startup st, int cont) {
		System.out.println("=========== STARTUP " + cont + " ===========");
		System.out.println("Permalink: " + st.getPermalink());
		System.out.println("Company: " + st.getCompany());
		System.out.println("NumEmps:" + st.getNumEmps());
		System.out.println("Category: " + st.getCategory());
		System.out.println("City: " + st.getCity());
		System.out.println("State: " + st.getState());
		System.out.println("FundedDate: " + st.getFundedDate());
		System.out.println("RaisedAMT: " + st.getRaisedAmt());
		System.out.println("RaisedCurrency: " + st.getRaisedCurrency());
		System.out.println("Round: " + st.getRound());
		System.out.println("=========== FIM STARTUP " + cont + " ===========");
	}

	public static void exibeDados(List<Startup> arrStartup) {
		System.out.println();
		System.out.println("=========== DADOS ADICIONAIS =========== ");
		long total = 0;
		long max = 0;
		long min = 0;
		int ocorrCompany = 0;

		// long max = arrStartup.stream().mapToInt(v ->
		// v).max().orElseThrow(NoSuchElementException::new);

		// long min = arrStartup.stream().mapToInt(v ->
		// v).min().orElseThrow(NoSuchElementException::new);

		for (int i = 0; i <= arrStartup.size() - 1; i++) {
			total = total + arrStartup.get(i).getRaisedAmt();

			if (i == 0) {
				max = arrStartup.get(i).getRaisedAmt();
				min = arrStartup.get(i).getRaisedAmt();
			} else {
				if (arrStartup.get(i).getRaisedAmt() > max)
					max = arrStartup.get(i).getRaisedAmt();

				if (arrStartup.get(i).getRaisedAmt() < min)
					min = arrStartup.get(i).getRaisedAmt();
			}

			if (arrStartup.get(i).getCompany().length() > 0)
				ocorrCompany++;

		}

		int med = arrStartup.size() / 2;
		System.out.println("========== RaisedAmt ==========");
		System.out.println("Total: " + total);
		System.out.println("Média: " + total / arrStartup.size());
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Mediana: " + arrStartup.get(med).getRaisedAmt());
		System.out.println();
		System.out.println("Ocorrências de Company: " +ocorrCompany);

	}
}
