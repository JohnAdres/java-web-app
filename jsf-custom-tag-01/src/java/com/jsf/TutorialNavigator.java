
package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 18, 2016
 */
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TutorialNavigator {
	public static final Map<String,String> pages = new HashMap<String,String>();

	public TutorialNavigator() {
		pages.put("foo", "page1.xhtml");
		pages.put("bar", "page2.xhtml");
	}
	public String navigate(String tutorial){
		return pages.get(tutorial) != null ? pages.get(tutorial) : "";
	}
}