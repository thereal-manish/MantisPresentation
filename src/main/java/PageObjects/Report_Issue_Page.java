package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Report_Issue_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//select[@id='category_id']")
	public static WebElement Category;

public void verify_Category(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Category.getAttribute("value"),data);
	}

}

public void verify_Category_Status(String data){
		//Verifies the Status of the Category
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Category(String data){
		Select dropdown= new Select(Category);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='reproducibility']")
	public static WebElement Reproducibility;

public void verify_Reproducibility(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reproducibility.getAttribute("value"),data);
	}

}

public void verify_Reproducibility_Status(String data){
		//Verifies the Status of the Reproducibility
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reproducibility.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reproducibility.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reproducibility.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reproducibility.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Reproducibility(String data){
		Select dropdown= new Select(Reproducibility);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='severity']")
	public static WebElement Severity;

public void verify_Severity(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Severity.getAttribute("value"),data);
	}

}

public void verify_Severity_Status(String data){
		//Verifies the Status of the Severity
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Severity(String data){
		Select dropdown= new Select(Severity);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='priority']")
	public static WebElement Priority;

public void verify_Priority(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Priority.getAttribute("value"),data);
	}

}

public void verify_Priority_Status(String data){
		//Verifies the Status of the Priority
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Priority(String data){
		Select dropdown= new Select(Priority);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='handler_id']")
	public static WebElement Assign_to;

public void verify_Assign_to(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assign_to.getAttribute("value"),data);
	}

}

public void verify_Assign_to_Status(String data){
		//Verifies the Status of the Assign_to
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_to.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_to.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_to.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_to.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assign_to(String data){
		Select dropdown= new Select(Assign_to);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='summary']")
	public static WebElement Summary_TEXT;

public void verify_Summary_TEXT(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Summary_TEXT.getAttribute("value"),data);
	}

}

public void verify_Summary_TEXT_Status(String data){
		//Verifies the Status of the Summary_TEXT
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_TEXT.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_TEXT.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_TEXT.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_TEXT.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Summary_TEXT(String data){
		Summary_TEXT.clear();
		Summary_TEXT.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='description']")
	public static WebElement Description;

public void verify_Description(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description.getAttribute("value"),data);
	}

}

public void verify_Description_Status(String data){
		//Verifies the Status of the Description
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description(String data){
		Description.clear();
		Description.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='platform']")
	public static WebElement Platform;

public void verify_Platform(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Platform.getAttribute("value"),data);
	}

}

public void verify_Platform_Status(String data){
		//Verifies the Status of the Platform
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Platform(String data){
		Platform.clear();
		Platform.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='os']")
	public static WebElement OS;

public void verify_OS(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS.getAttribute("value"),data);
	}

}

public void verify_OS_Status(String data){
		//Verifies the Status of the OS
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS(String data){
		OS.clear();
		OS.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='os_build']")
	public static WebElement OS_Version;

public void verify_OS_Version(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_Version.getAttribute("value"),data);
	}

}

public void verify_OS_Version_Status(String data){
		//Verifies the Status of the OS_Version
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS_Version(String data){
		OS_Version.clear();
		OS_Version.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='steps_to_reproduce']")
	public static WebElement Steps_to_Reproduce;

public void verify_Steps_to_Reproduce(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Steps_to_Reproduce.getAttribute("value"),data);
	}

}

public void verify_Steps_to_Reproduce_Status(String data){
		//Verifies the Status of the Steps_to_Reproduce
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_Reproduce.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_Reproduce.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_Reproduce.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_Reproduce.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Steps_to_Reproduce(String data){
		Steps_to_Reproduce.clear();
		Steps_to_Reproduce.sendKeys(data);
}

@FindBy(how= How.ID, using = "Additional_Information")
	public static WebElement Additional_Information;

public void verify_Additional_Information(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Additional_Information.getAttribute("value"),data);
	}

}

public void verify_Additional_Information_Status(String data){
		//Verifies the Status of the Additional_Information
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_Information.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_Information.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_Information.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_Information.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Additional_Information(String data){
		Additional_Information.clear();
		Additional_Information.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='tag_string']")
	public static WebElement Attach_Tags;

public void verify_Attach_Tags(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Attach_Tags.getAttribute("value"),data);
	}

}

public void verify_Attach_Tags_Status(String data){
		//Verifies the Status of the Attach_Tags
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attach_Tags.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attach_Tags.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attach_Tags.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attach_Tags.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Attach_Tags(String data){
		Attach_Tags.clear();
		Attach_Tags.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//span[normalize-space()='check to report more issues']")
	public static WebElement Report_Stay;

public void verify_Report_Stay(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Report_Stay.getAttribute("value"),data);
	}

}

public void verify_Report_Stay_Status(String data){
		//Verifies the Status of the Report_Stay
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Report_Stay.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Report_Stay.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Report_Stay.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Report_Stay.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Report_Stay(String data){
		if(Report_Stay.isSelected());
			Report_Stay.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Submit Issue']")
	public static WebElement Submit_Issue;

public void verify_Submit_Issue_Status(String data){
		//Verifies the Status of the Submit_Issue
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submit_Issue.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submit_Issue.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submit_Issue.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submit_Issue.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Submit_Issue(){
		Submit_Issue.click();
}

@FindBy(how= How.XPATH, using = "//i[@title='+']")
	public static WebElement Select_Profile;

public void verify_Select_Profile_Status(String data){
		//Verifies the Status of the Select_Profile
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Select_Profile.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Select_Profile.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Select_Profile.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Select_Profile.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Select_Profile(){
		Select_Profile.click();
}

@FindBy(how= How.XPATH, using = "//i[@class='fa fa-cloud-upload upload-icon ace-icon blue fa-3x']")
	public static WebElement Upload_Files;

public void verify_Upload_Files_Status(String data){
		//Verifies the Status of the Upload_Files
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Upload_Files.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Upload_Files.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Upload_Files.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Upload_Files.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Upload_Files(){
		Upload_Files.click();
}

@FindBy(how= How.XPATH, using = "//select[@id='tag_select']")
	public static WebElement Existing_tags;

public void verify_Existing_tags(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Existing_tags.getAttribute("value"),data);
	}

}

public void verify_Existing_tags_Status(String data){
		//Verifies the Status of the Existing_tags
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Existing_tags.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Existing_tags.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Existing_tags.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Existing_tags.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Existing_tags(String data){
		Select dropdown= new Select(Existing_tags);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//tbody/tr[13]/td[1]")
	public static WebElement View_Status;

public void verify_View_Status(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(View_Status.getAttribute("name"),data);
	}

}

public void verify_View_Status_Status(String data){
		//Verifies the Status of the View_Status
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "All_Categories")
	public static WebElement All_Categories;

public void verify_All_Categories(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(All_Categories.getAttribute("name"),data);
	}

}

public void verify_All_Categories_Status(String data){
		//Verifies the Status of the All_Categories
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(All_Categories.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(All_Categories.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!All_Categories.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!All_Categories.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "have_not_tried")
	public static WebElement have_not_tried;

public void verify_have_not_tried(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(have_not_tried.getAttribute("name"),data);
	}

}

public void verify_have_not_tried_Status(String data){
		//Verifies the Status of the have_not_tried
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(have_not_tried.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(have_not_tried.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!have_not_tried.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!have_not_tried.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "unable_to_reproduce")
	public static WebElement unable_to_reproduce;

public void verify_unable_to_reproduce(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(unable_to_reproduce.getAttribute("name"),data);
	}

}

public void verify_unable_to_reproduce_Status(String data){
		//Verifies the Status of the unable_to_reproduce
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unable_to_reproduce.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unable_to_reproduce.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unable_to_reproduce.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unable_to_reproduce.isEnabled());
				break;
			default:
				break;
			}
		}
	}

	/*
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Category_-DD") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Category__DD;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Category__DD_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Category__DD
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Category__DD,
	 * selenium_XPATH_______tbody_tr_13__td_1__Category__DD); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Category__DD(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Category__DD.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_All_Categories") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__All_Categories;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__All_Categories_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__All_Categories
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__All_Categories,
	 * selenium_XPATH_______tbody_tr_13__td_1__All_Categories); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__All_Categories(){
	 * selenium_XPATH_______tbody_tr_13__td_1__All_Categories.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Project_1") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_1;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Project_1_Status(String data){
	 * //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_1
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Project_1,
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_1); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Project_1(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_1.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Project_2") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_2;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Project_2_Status(String data){
	 * //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_2
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Project_2,
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_2); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Project_2(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Project_2.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Reproducibility_-DD") public
	 * WebElement selenium_XPATH_______tbody_tr_13__td_1__Reproducibility__DD;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Reproducibility__DD_Status(
	 * String data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Reproducibility__DD
	 * Assert.assertEquals(
	 * selenium_XPATH_______tbody_tr_13__td_1__Reproducibility__DD,
	 * selenium_XPATH_______tbody_tr_13__td_1__Reproducibility__DD); }
	 * 
	 * public void
	 * select_selenium_XPATH_______tbody_tr_13__td_1__Reproducibility__DD(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Reproducibility__DD.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_always") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__always;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__always_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__always
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__always,
	 * selenium_XPATH_______tbody_tr_13__td_1__always); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__always(){
	 * selenium_XPATH_______tbody_tr_13__td_1__always.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_sometimes") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__sometimes;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__sometimes_Status(String data){
	 * //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__sometimes
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__sometimes,
	 * selenium_XPATH_______tbody_tr_13__td_1__sometimes); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__sometimes(){
	 * selenium_XPATH_______tbody_tr_13__td_1__sometimes.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_random") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__random;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__random_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__random
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__random,
	 * selenium_XPATH_______tbody_tr_13__td_1__random); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__random(){
	 * selenium_XPATH_______tbody_tr_13__td_1__random.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_have_not_tried") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__have_not_tried;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__have_not_tried_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__have_not_tried
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__have_not_tried,
	 * selenium_XPATH_______tbody_tr_13__td_1__have_not_tried); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__have_not_tried(){
	 * selenium_XPATH_______tbody_tr_13__td_1__have_not_tried.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_unable_to_reproduce") public
	 * WebElement selenium_XPATH_______tbody_tr_13__td_1__unable_to_reproduce;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__unable_to_reproduce_Status(
	 * String data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__unable_to_reproduce
	 * Assert.assertEquals(
	 * selenium_XPATH_______tbody_tr_13__td_1__unable_to_reproduce,
	 * selenium_XPATH_______tbody_tr_13__td_1__unable_to_reproduce); }
	 * 
	 * public void
	 * select_selenium_XPATH_______tbody_tr_13__td_1__unable_to_reproduce(){
	 * selenium_XPATH_______tbody_tr_13__td_1__unable_to_reproduce.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_N/A")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__N_A;
	 * 
	 * public void verify_selenium_XPATH_______tbody_tr_13__td_1__N_A_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__N_A
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__N_A,
	 * selenium_XPATH_______tbody_tr_13__td_1__N_A); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__N_A(){
	 * selenium_XPATH_______tbody_tr_13__td_1__N_A.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Severity_-DD") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Severity__DD;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Severity__DD_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Severity__DD
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Severity__DD,
	 * selenium_XPATH_______tbody_tr_13__td_1__Severity__DD); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Severity__DD(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Severity__DD.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_feature") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__feature;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__feature_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__feature
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__feature,
	 * selenium_XPATH_______tbody_tr_13__td_1__feature); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__feature(){
	 * selenium_XPATH_______tbody_tr_13__td_1__feature.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_trival") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__trival;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__trival_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__trival
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__trival,
	 * selenium_XPATH_______tbody_tr_13__td_1__trival); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__trival(){
	 * selenium_XPATH_______tbody_tr_13__td_1__trival.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_text")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__text;
	 * 
	 * public void verify_selenium_XPATH_______tbody_tr_13__td_1__text_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__text
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__text,
	 * selenium_XPATH_______tbody_tr_13__td_1__text); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__text(){
	 * selenium_XPATH_______tbody_tr_13__td_1__text.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_tweak")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__tweak;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__tweak_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__tweak
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__tweak,
	 * selenium_XPATH_______tbody_tr_13__td_1__tweak); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__tweak(){
	 * selenium_XPATH_______tbody_tr_13__td_1__tweak.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_minor")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__minor;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__minor_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__minor
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__minor,
	 * selenium_XPATH_______tbody_tr_13__td_1__minor); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__minor(){
	 * selenium_XPATH_______tbody_tr_13__td_1__minor.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_major")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__major;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__major_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__major
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__major,
	 * selenium_XPATH_______tbody_tr_13__td_1__major); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__major(){
	 * selenium_XPATH_______tbody_tr_13__td_1__major.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_crash")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__crash;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__crash_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__crash
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__crash,
	 * selenium_XPATH_______tbody_tr_13__td_1__crash); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__crash(){
	 * selenium_XPATH_______tbody_tr_13__td_1__crash.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_block")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__block;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__block_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__block
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__block,
	 * selenium_XPATH_______tbody_tr_13__td_1__block); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__block(){
	 * selenium_XPATH_______tbody_tr_13__td_1__block.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Priority_-DD") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Priority__DD;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Priority__DD_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Priority__DD
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Priority__DD,
	 * selenium_XPATH_______tbody_tr_13__td_1__Priority__DD); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Priority__DD(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Priority__DD.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_none")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__none;
	 * 
	 * public void verify_selenium_XPATH_______tbody_tr_13__td_1__none_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__none
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__none,
	 * selenium_XPATH_______tbody_tr_13__td_1__none); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__none(){
	 * selenium_XPATH_______tbody_tr_13__td_1__none.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_low")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__low;
	 * 
	 * public void verify_selenium_XPATH_______tbody_tr_13__td_1__low_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__low
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__low,
	 * selenium_XPATH_______tbody_tr_13__td_1__low); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__low(){
	 * selenium_XPATH_______tbody_tr_13__td_1__low.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_normal") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__normal;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__normal_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__normal
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__normal,
	 * selenium_XPATH_______tbody_tr_13__td_1__normal); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__normal(){
	 * selenium_XPATH_______tbody_tr_13__td_1__normal.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_high")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__high;
	 * 
	 * public void verify_selenium_XPATH_______tbody_tr_13__td_1__high_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__high
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__high,
	 * selenium_XPATH_______tbody_tr_13__td_1__high); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__high(){
	 * selenium_XPATH_______tbody_tr_13__td_1__high.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_urgent") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__urgent;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__urgent_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__urgent
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__urgent,
	 * selenium_XPATH_______tbody_tr_13__td_1__urgent); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__urgent(){
	 * selenium_XPATH_______tbody_tr_13__td_1__urgent.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_immediate") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__immediate;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__immediate_Status(String data){
	 * //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__immediate
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__immediate,
	 * selenium_XPATH_______tbody_tr_13__td_1__immediate); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__immediate(){
	 * selenium_XPATH_______tbody_tr_13__td_1__immediate.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Assigned_to_-DD") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Assigned_to__DD;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Assigned_to__DD_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Assigned_to__DD
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Assigned_to__DD,
	 * selenium_XPATH_______tbody_tr_13__td_1__Assigned_to__DD); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Assigned_to__DD(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Assigned_to__DD.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_unassigned") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__unassigned;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__unassigned_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__unassigned
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__unassigned,
	 * selenium_XPATH_______tbody_tr_13__td_1__unassigned); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__unassigned(){
	 * selenium_XPATH_______tbody_tr_13__td_1__unassigned.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_user1")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__user1;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__user1_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__user1
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__user1,
	 * selenium_XPATH_______tbody_tr_13__td_1__user1); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__user1(){
	 * selenium_XPATH_______tbody_tr_13__td_1__user1.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_user2")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__user2;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__user2_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__user2
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__user2,
	 * selenium_XPATH_______tbody_tr_13__td_1__user2); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__user2(){
	 * selenium_XPATH_______tbody_tr_13__td_1__user2.click(); }
	 * 
	 * @FindBy(how= How.ID, using = "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_user3")
	 * public WebElement selenium_XPATH_______tbody_tr_13__td_1__user3;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__user3_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__user3
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__user3,
	 * selenium_XPATH_______tbody_tr_13__td_1__user3); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__user3(){
	 * selenium_XPATH_______tbody_tr_13__td_1__user3.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Existingtags-DD") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Existingtags_DD;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Existingtags_DD_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Existingtags_DD
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Existingtags_DD,
	 * selenium_XPATH_______tbody_tr_13__td_1__Existingtags_DD); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Existingtags_DD(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Existingtags_DD.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Existing_tags") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Existing_tags;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Existing_tags_Status(String
	 * data){ //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Existing_tags
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Existing_tags,
	 * selenium_XPATH_______tbody_tr_13__td_1__Existing_tags); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Existing_tags(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Existing_tags.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_Dont_care") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__Dont_care;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__Dont_care_Status(String data){
	 * //Verifies the Status of the
	 * selenium_XPATH_______tbody_tr_13__td_1__Dont_care
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__Dont_care,
	 * selenium_XPATH_______tbody_tr_13__td_1__Dont_care); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__Dont_care(){
	 * selenium_XPATH_______tbody_tr_13__td_1__Dont_care.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_public") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__public;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__public_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__public
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__public,
	 * selenium_XPATH_______tbody_tr_13__td_1__public); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__public(){
	 * selenium_XPATH_______tbody_tr_13__td_1__public.click(); }
	 * 
	 * @FindBy(how= How.ID, using =
	 * "selenium:XPATH"_=_"//tbody/tr[13]/td[1]_private") public WebElement
	 * selenium_XPATH_______tbody_tr_13__td_1__private;
	 * 
	 * public void
	 * verify_selenium_XPATH_______tbody_tr_13__td_1__private_Status(String data){
	 * //Verifies the Status of the selenium_XPATH_______tbody_tr_13__td_1__private
	 * Assert.assertEquals(selenium_XPATH_______tbody_tr_13__td_1__private,
	 * selenium_XPATH_______tbody_tr_13__td_1__private); }
	 * 
	 * public void select_selenium_XPATH_______tbody_tr_13__td_1__private(){
	 * selenium_XPATH_______tbody_tr_13__td_1__private.click(); }
	 */
public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}