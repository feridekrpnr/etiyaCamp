package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { //public final yaparsak override edilemez
		return tutar * 1.18;
	}
}
