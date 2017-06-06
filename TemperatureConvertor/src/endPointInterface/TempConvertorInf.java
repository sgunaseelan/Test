package endPointInterface;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService(targetNamespace="http://sortedset.com/wsdl")
public interface TempConvertorInf {
	@WebMethod float toCelsius(float farheneheitTemp);
	@WebMethod float tofarhenheit(float celsiusTemp);
}
