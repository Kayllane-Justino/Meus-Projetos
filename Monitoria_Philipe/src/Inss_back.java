public class Inss_back {
	
	public double salario_bruto;
	public double aliquota_inss;
	public double valor_inss;
	public double aliquota_ir;
	public double redutor_ir;
	public double resultado_inss;
	public double resultado_ir;
	public double salario_liquido;
	public double resultado_salario_liquido;
	
	public void calc_inss(double sal_bru, double ali_inss, double resul_inss) {
		this.salario_bruto = sal_bru;
		this.aliquota_inss = ali_inss;
		this.resultado_inss = resul_inss; 
		
		resul_inss = (sal_bru * ali_inss)/100;
		
		System.out.println("Seus INSS é: " + resul_inss);
		
	}
		public void calc_ir(double sal_bru, double ali_inss, double ali_ir, double resul_ir, double sal_liq) {
			this.salario_bruto = sal_bru; 
			this.aliquota_inss = ali_inss;
			this.aliquota_ir = ali_ir;
			this.resultado_ir = resul_ir;
			this.salario_liquido = sal_liq;
			
			resul_ir = ((sal_bru - valor_inss)*ali_ir)/100 - redutor_ir;
			
			System.out.println("Seu resultado é: " + resul_ir);
			
	}
		
		public void calc_sal_liquido(double sal_bru, double ali_inss, double ali_ir, double resul_ir, double sal_liq, double resul_sal_liq, double valor_ir) {
			this.salario_bruto = sal_bru;
			this.aliquota_inss = ali_inss;
			this.aliquota_ir = ali_ir;
			this.resultado_ir = resul_ir;
			this.salario_liquido = sal_liq;
			this.resultado_salario_liquido = resul_sal_liq;
			
			resul_sal_liq = ( sal_bru - valor_inss - valor_ir ); 
			
			System.out.println("");
	}	
		
}
