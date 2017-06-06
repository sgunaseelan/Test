package endPointImplement;

import javax.jws.WebService;

import endPointInterface.TempConvertorInf;

@WebService(endpointInterface="endPointInterface.TempConvertorInf")
public class TempConvertorImp implements TempConvertorInf {

	@Override
	public float toCelsius(float farheneheitTemp)
	{
		return (5/9)*(farheneheitTemp-32);
	}

	@Override
	public float tofarhenheit(float celsiusTemp) 
	{
		return (9/5)*(celsiusTemp+32);
	}
}
