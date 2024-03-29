package wx.resilience.impl.util;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
import com.wm.app.b2b.server.*;
import com.wm.lang.ns.NSService;
import java.util.Stack;
// --- <<IS-END-IMPORTS>> ---

public final class string

{
	// ---( internal utility methods )---

	final static string _instance = new string();

	static string _newInstance() { return new string(); }

	static string _cast(Object o) { return (string)o; }

	// ---( server methods )---




	public static final void flipList (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(flipList)>> ---
		// @sigtype java 3.5
		// [i] field:1:required inputStringList
		// [o] field:1:required outputStringList
		IDataMap pipeMap = new IDataMap(pipeline);
		
		String inputStringList[] = pipeMap.getAsStringArray("inputStringList");
		
		if (inputStringList != null) {
			int length = inputStringList.length;
			String[] outputStringList = new String[length];
			for (int i = 0; i < length; i++) {
				outputStringList[length - i - 1] = inputStringList[i];
			}
			pipeMap.put("outputStringList", outputStringList);
		}
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	
	private static String checkNull(String inputString, String separator)
	{
	  if (inputString == null)
	    return "";
	  else
	    return separator + inputString;
	}
	
		
	// --- <<IS-END-SHARED>> ---
}

