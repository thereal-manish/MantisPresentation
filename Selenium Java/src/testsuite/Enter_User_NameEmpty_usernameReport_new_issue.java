package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Enter_User_NameEmpty_usernameReport_new_issue
*/
public class Enter_User_NameEmpty_usernameReport_new_issue extends PageObjectBase
{

	public Enter_User_NameEmpty_usernameReport_new_issue()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD,final String Step_2_username_TEXTBOX_Status,final String Step_2_username_TEXTBOX_Verification,final String Step_2_Login_BUTTON_Status,final String Step_2_Sign_up_for_a_new_account_HYPERLINK_Status,final String Step_2_Empty_username_error_message_LABEL_Status,final String Step_3_username_TEXTBOX,final String Step_5_username_TEXTBOX_Status,final String Step_5_username_TEXTBOX_Verification,final String Step_5_Login_BUTTON_Status,final String Step_5_Sign_up_for_a_new_account_HYPERLINK_Status,final String Step_5_Empty_username_error_message_LABEL_Status,final String Step_9_projectnameCNP_TEXTBOX,final String Step_9_Description_CNP_TEXTBOX,final String Step_9_Status_DROPDOWN,final String Step_9_ViewStatus_DROPDOWN,final String Step_9_InheritanceGlobal_Sts_CHECKBOX,final String Step_12_Category_DROPDOWN_Status,final String Step_12_Category_DROPDOWN_Verification,final String Step_12_Reproducibility_DROPDOWN_Status,final String Step_12_Reproducibility_DROPDOWN_Verification,final String Step_12_Severity_DROPDOWN_Status,final String Step_12_Severity_DROPDOWN_Verification,final String Step_12_Priority_DROPDOWN_Status,final String Step_12_Priority_DROPDOWN_Verification,final String Step_12_Assign_to_DROPDOWN_Status,final String Step_12_Assign_to_DROPDOWN_Verification,final String Step_12_Summary_TEXT_TEXTBOX_Status,final String Step_12_Summary_TEXT_TEXTBOX_Verification,final String Step_12_Description_TEXTBOX_Status,final String Step_12_Description_TEXTBOX_Verification,final String Step_12_Platform_TEXTBOX_Status,final String Step_12_Platform_TEXTBOX_Verification,final String Step_12_OS_TEXTBOX_Status,final String Step_12_OS_TEXTBOX_Verification,final String Step_12_OS_Version_TEXTBOX_Status,final String Step_12_OS_Version_TEXTBOX_Verification,final String Step_12_Steps_to_Reproduce_TEXTBOX_Status,final String Step_12_Steps_to_Reproduce_TEXTBOX_Verification,final String Step_12_Additional_Information_TEXTBOX_Status,final String Step_12_Additional_Information_TEXTBOX_Verification,final String Step_12_Attach_Tags_TEXTBOX_Status,final String Step_12_Attach_Tags_TEXTBOX_Verification,final String Step_12_Report_Stay_CHECKBOX_Status,final String Step_12_Report_Stay_CHECKBOX_Verification,final String Step_12_Submit_Issue_BUTTON_Status,final String Step_12_Select_Profile_HYPERLINK_Status,final String Step_12_Upload_Files_HYPERLINK_Status,final String Step_12_Existing_tags_DROPDOWN_Status,final String Step_12_Existing_tags_DROPDOWN_Verification,final String Step_12_View_Status_RADIOBUTTONGROUP_Verification,final String Step_12_public_RADIOBUTTON_Status,final String Step_12_private_RADIOBUTTON_Status,final String Step_13_Category_DROPDOWN,final String Step_13_Reproducibility_DROPDOWN,final String Step_13_Severity_DROPDOWN,final String Step_13_Priority_DROPDOWN,final String Step_13_Assign_to_DROPDOWN,final String Step_13_Summary_TEXT_TEXTBOX,final String Step_13_Description_TEXTBOX,final String Step_13_Platform_TEXTBOX,final String Step_13_OS_TEXTBOX,final String Step_13_OS_Version_TEXTBOX,final String Step_13_Steps_to_Reproduce_TEXTBOX,final String Step_13_Additional_Information_TEXTBOX,final String Step_13_Attach_Tags_TEXTBOX,final String Step_13_Report_Stay_CHECKBOX,final String Step_13_Existing_tags_DROPDOWN,final String Step_13_View_Status_RADIOBUTTONGROUP) throws Exception

	{

	Launch_URL_Page launch_url_page_init=PageFactory.initElements(driver, Launch_URL_Page.class);

	ManageEditProject_Page manageeditproject_page_init=PageFactory.initElements(driver, ManageEditProject_Page.class);

	Login_Screen_Page login_screen_page_init=PageFactory.initElements(driver, Login_Screen_Page.class);

	Loginpass_Screen_Page loginpass_screen_page_init=PageFactory.initElements(driver, Loginpass_Screen_Page.class);

	Issue_Submit_Page issue_submit_page_init=PageFactory.initElements(driver, Issue_Submit_Page.class);

	Manage_Screen_Page manage_screen_page_init=PageFactory.initElements(driver, Manage_Screen_Page.class);

	DeleteTag_popup_Page deletetag_popup_page_init=PageFactory.initElements(driver, DeleteTag_popup_Page.class);

	Mantis_Home_Page mantis_home_page_init=PageFactory.initElements(driver, Mantis_Home_Page.class);

	Report_Issue_Page report_issue_page_init=PageFactory.initElements(driver, Report_Issue_Page.class);

	Update_Issue_scr_Page update_issue_scr_page_init=PageFactory.initElements(driver, Update_Issue_scr_Page.class);

	View_issue_details_Page view_issue_details_page_init=PageFactory.initElements(driver, View_issue_details_Page.class);

	Edit_Activities_note_Page edit_activities_note_page_init=PageFactory.initElements(driver, Edit_Activities_note_Page.class);

	Delete_Activity_note_Page delete_activity_note_page_init=PageFactory.initElements(driver, Delete_Activity_note_Page.class);

	Send_Reminder_popup_Page send_reminder_popup_page_init=PageFactory.initElements(driver, Send_Reminder_popup_Page.class);

	Send_Reminder_Page send_reminder_page_init=PageFactory.initElements(driver, Send_Reminder_Page.class);

	View_Issues_Page view_issues_page_init=PageFactory.initElements(driver, View_Issues_Page.class);

	Print_Reports_Page print_reports_page_init=PageFactory.initElements(driver, Print_Reports_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Enter_User_NameEmpty_usernameReport_new_issue", "TC_Enter_User_NameEmpty_usernameReport_new_issue", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform Launch URL Action");

	testReport.fillTableStep("Step 1", "Perform Launch URL Action");

	launch_url_page_init.enter_URL(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify Login Screen screen");

	testReport.fillTableStep("Step 2", "verify Login Screen screen");

	login_screen_page_init.verify_username_Status(Step_2_username_TEXTBOX_Status);

	login_screen_page_init.verify_username(Step_2_username_TEXTBOX_Verification);
	login_screen_page_init.verify_Login_Status(Step_2_Login_BUTTON_Status);

	login_screen_page_init.verify_Sign_up_for_a_new_account_Status(Step_2_Sign_up_for_a_new_account_HYPERLINK_Status);

	login_screen_page_init.verify_Empty_username_error_message_Status(Step_2_Empty_username_error_message_LABEL_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_2");

	Reporter.log("Step - 3- Fill User Name form Login Screen screen");

	testReport.fillTableStep("Step 3", "Fill User Name form Login Screen screen");

	login_screen_page_init.set_username(Step_3_username_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_3");

	Reporter.log("Step - 4- click Login button Login Screen screen User Name form");

	testReport.fillTableStep("Step 4", "click Login button Login Screen screen User Name form");

	login_screen_page_init.click_Login();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_4");

	Reporter.log("Step - 5- verify Login Screen screen");

	testReport.fillTableStep("Step 5", "verify Login Screen screen");

	login_screen_page_init.verify_username_Status(Step_5_username_TEXTBOX_Status);

	login_screen_page_init.verify_username(Step_5_username_TEXTBOX_Verification);
	login_screen_page_init.verify_Login_Status(Step_5_Login_BUTTON_Status);

	login_screen_page_init.verify_Sign_up_for_a_new_account_Status(Step_5_Sign_up_for_a_new_account_HYPERLINK_Status);

	login_screen_page_init.verify_Empty_username_error_message_Status(Step_5_Empty_username_error_message_LABEL_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_5");

	Reporter.log("Step - 6- Select Manage clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	testReport.fillTableStep("Step 6", "Select Manage clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	mantis_home_page_init.click_Manage();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_6");

	Reporter.log("Step - 7- Select Manage Projects tab Manage Screen screen");

	testReport.fillTableStep("Step 7", "Select Manage Projects tab Manage Screen screen");

	manage_screen_page_init.click_Manage_Projects();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_7");

	Reporter.log("Step - 8- click Create Projects MP button Manage Screen screen Manage Projects tab Projects group");

	testReport.fillTableStep("Step 8", "click Create Projects MP button Manage Screen screen Manage Projects tab Projects group");

	manage_screen_page_init.click_Create_Projects_MP();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_8");

	Reporter.log("Step - 9- Fill create new projects form Manage Screen screen");

	testReport.fillTableStep("Step 9", "Fill create new projects form Manage Screen screen");

	manage_screen_page_init.set_projectnameCNP(Step_9_projectnameCNP_TEXTBOX);
	manage_screen_page_init.set_Description_CNP(Step_9_Description_CNP_TEXTBOX);
	manage_screen_page_init.select_Status(Step_9_Status_DROPDOWN);
	manage_screen_page_init.select_ViewStatus(Step_9_ViewStatus_DROPDOWN);
	manage_screen_page_init.select_InheritanceGlobal_Sts(Step_9_InheritanceGlobal_Sts_CHECKBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_9");

	Reporter.log("Step - 10- click Add project CNP button Manage Screen screen create new projects form");

	testReport.fillTableStep("Step 10", "click Add project CNP button Manage Screen screen create new projects form");

	manage_screen_page_init.click_Add_project_CNP();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_10");

	Reporter.log("Step - 11- Select Report Issuse Button clickchoice Mantis Home screen Mantis Navbar menubar Report menu");

	testReport.fillTableStep("Step 11", "Select Report Issuse Button clickchoice Mantis Home screen Mantis Navbar menubar Report menu");

	mantis_home_page_init.click_Report_Issuse_Button();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_11");

	Reporter.log("Step - 12- verify Report Issue screen");

	testReport.fillTableStep("Step 12", "verify Report Issue screen");

	report_issue_page_init.verify_Category_Status(Step_12_Category_DROPDOWN_Status);

	report_issue_page_init.verify_Category(Step_12_Category_DROPDOWN_Verification);
	report_issue_page_init.verify_Reproducibility_Status(Step_12_Reproducibility_DROPDOWN_Status);

	report_issue_page_init.verify_Reproducibility(Step_12_Reproducibility_DROPDOWN_Verification);
	report_issue_page_init.verify_Severity_Status(Step_12_Severity_DROPDOWN_Status);

	report_issue_page_init.verify_Severity(Step_12_Severity_DROPDOWN_Verification);
	report_issue_page_init.verify_Priority_Status(Step_12_Priority_DROPDOWN_Status);

	report_issue_page_init.verify_Priority(Step_12_Priority_DROPDOWN_Verification);
	report_issue_page_init.verify_Assign_to_Status(Step_12_Assign_to_DROPDOWN_Status);

	report_issue_page_init.verify_Assign_to(Step_12_Assign_to_DROPDOWN_Verification);
	report_issue_page_init.verify_Summary_TEXT_Status(Step_12_Summary_TEXT_TEXTBOX_Status);

	report_issue_page_init.verify_Summary_TEXT(Step_12_Summary_TEXT_TEXTBOX_Verification);
	report_issue_page_init.verify_Description_Status(Step_12_Description_TEXTBOX_Status);

	report_issue_page_init.verify_Description(Step_12_Description_TEXTBOX_Verification);
	report_issue_page_init.verify_Platform_Status(Step_12_Platform_TEXTBOX_Status);

	report_issue_page_init.verify_Platform(Step_12_Platform_TEXTBOX_Verification);
	report_issue_page_init.verify_OS_Status(Step_12_OS_TEXTBOX_Status);

	report_issue_page_init.verify_OS(Step_12_OS_TEXTBOX_Verification);
	report_issue_page_init.verify_OS_Version_Status(Step_12_OS_Version_TEXTBOX_Status);

	report_issue_page_init.verify_OS_Version(Step_12_OS_Version_TEXTBOX_Verification);
	report_issue_page_init.verify_Steps_to_Reproduce_Status(Step_12_Steps_to_Reproduce_TEXTBOX_Status);

	report_issue_page_init.verify_Steps_to_Reproduce(Step_12_Steps_to_Reproduce_TEXTBOX_Verification);
	report_issue_page_init.verify_Additional_Information_Status(Step_12_Additional_Information_TEXTBOX_Status);

	report_issue_page_init.verify_Additional_Information(Step_12_Additional_Information_TEXTBOX_Verification);
	report_issue_page_init.verify_Attach_Tags_Status(Step_12_Attach_Tags_TEXTBOX_Status);

	report_issue_page_init.verify_Attach_Tags(Step_12_Attach_Tags_TEXTBOX_Verification);
	report_issue_page_init.verify_Report_Stay_Status(Step_12_Report_Stay_CHECKBOX_Status);

	report_issue_page_init.verify_Report_Stay(Step_12_Report_Stay_CHECKBOX_Verification);
	report_issue_page_init.verify_Submit_Issue_Status(Step_12_Submit_Issue_BUTTON_Status);

	report_issue_page_init.verify_Select_Profile_Status(Step_12_Select_Profile_HYPERLINK_Status);

	report_issue_page_init.verify_Upload_Files_Status(Step_12_Upload_Files_HYPERLINK_Status);

	report_issue_page_init.verify_Existing_tags_Status(Step_12_Existing_tags_DROPDOWN_Status);

	report_issue_page_init.verify_Existing_tags(Step_12_Existing_tags_DROPDOWN_Verification);
	report_issue_page_init.verify_View_Status(Step_12_View_Status_RADIOBUTTONGROUP_Verification);

	report_issue_page_init.verify_View_Status_public_Status(Step_12_public_RADIOBUTTON_Status);

	report_issue_page_init.verify_View_Status_private_Status(Step_12_private_RADIOBUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_12");

	Reporter.log("Step - 13- Fill Enter Issue Details form Report Issue screen");

	testReport.fillTableStep("Step 13", "Fill Enter Issue Details form Report Issue screen");

	report_issue_page_init.select_Category(Step_13_Category_DROPDOWN);
	report_issue_page_init.select_Reproducibility(Step_13_Reproducibility_DROPDOWN);
	report_issue_page_init.select_Severity(Step_13_Severity_DROPDOWN);
	report_issue_page_init.select_Priority(Step_13_Priority_DROPDOWN);
	report_issue_page_init.select_Assign_to(Step_13_Assign_to_DROPDOWN);
	report_issue_page_init.set_Summary_TEXT(Step_13_Summary_TEXT_TEXTBOX);
	report_issue_page_init.set_Description(Step_13_Description_TEXTBOX);
	report_issue_page_init.set_Platform(Step_13_Platform_TEXTBOX);
	report_issue_page_init.set_OS(Step_13_OS_TEXTBOX);
	report_issue_page_init.set_OS_Version(Step_13_OS_Version_TEXTBOX);
	report_issue_page_init.set_Steps_to_Reproduce(Step_13_Steps_to_Reproduce_TEXTBOX);
	report_issue_page_init.set_Additional_Information(Step_13_Additional_Information_TEXTBOX);
	report_issue_page_init.set_Attach_Tags(Step_13_Attach_Tags_TEXTBOX);
	report_issue_page_init.select_Report_Stay(Step_13_Report_Stay_CHECKBOX);
	report_issue_page_init.select_Existing_tags(Step_13_Existing_tags_DROPDOWN);
	report_issue_page_init.select_View_Status_Step_13_View_Status_RADIOBUTTONGROUP);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_13");

	Reporter.log("Step - 14- click Submit Issue button Report Issue screen Enter Issue Details form");

	testReport.fillTableStep("Step 14", "click Submit Issue button Report Issue screen Enter Issue Details form");

	report_issue_page_init.click_Submit_Issue();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEmpty_usernameReport_new_issue","Step_14");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_4");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Enter_User_NameEmpty_usernameReport_new_issue");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
