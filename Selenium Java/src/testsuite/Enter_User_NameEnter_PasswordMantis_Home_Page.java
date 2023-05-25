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
	Enter_User_NameEnter_PasswordMantis_Home_Page
*/
public class Enter_User_NameEnter_PasswordMantis_Home_Page extends PageObjectBase
{

	public Enter_User_NameEnter_PasswordMantis_Home_Page()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD,final String Step_2_username_TEXTBOX_Status,final String Step_2_username_TEXTBOX_Verification,final String Step_2_Login_BUTTON_Status,final String Step_2_Sign_up_for_a_new_account_HYPERLINK_Status,final String Step_2_Empty_username_error_message_LABEL_Status,final String Step_3_username_TEXTBOX,final String Step_5_Enter_your_password_TEXTBOX_Status,final String Step_5_Enter_your_password_TEXTBOX_Verification,final String Step_5_Login_BUTTON_Status,final String Step_5_Keep_me_logged_in_CHECKBOX_Status,final String Step_5_Keep_me_logged_in_CHECKBOX_Verification,final String Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Status,final String Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Verification,final String Step_5_Lost_your_password__HYPERLINK_Status,final String Step_5_Invalid_credentials_error_message_LABEL_Status,final String Step_6_Enter_your_password_TEXTBOX,final String Step_6_Keep_me_logged_in_CHECKBOX,final String Step_6_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX,final String Step_8_Issue_ID_SELF_HYPERLINK_Status,final String Step_8_Issue_Name_SELF_HYPERLINK_Status,final String Step_8_View_Issues_SELF_BUTTON_Status,final String Step_8_fghj_LABEL_Status,final String Step_8_Issue_ID_UN_HYPERLINK_Status,final String Step_8_Issue_Name_UN_HYPERLINK_Status,final String Step_8_View_Issues_UN_BUTTON_Status,final String Step_8_Issue_ID_REP_ME_HYPERLINK_Status,final String Step_8_Issue_Name_REP_ME_HYPERLINK_Status,final String Step_8_View_Issues_REP_ME_BUTTON_Status,final String Step_8_Issue_ID_RES_HYPERLINK_Status,final String Step_8_Issue_Name_RES_HYPERLINK_Status,final String Step_8_View_Issues_RES_BUTTON_Status,final String Step_8_Issue_ID_REC_HYPERLINK_Status,final String Step_8_Issue_Name_REC_HYPERLINK_Status,final String Step_8_View_Issues_REC_BUTTON_Status,final String Step_8_Previous_BUTTON_Status,final String Step_8_username_TIMELINE_HYPERLINK_Status,final String Step_8_Issue_ID_TIMELINE_HYPERLINK_Status,final String Step_10_Category_DROPDOWN_Status,final String Step_10_Category_DROPDOWN_Verification,final String Step_10_Reproducibility_DROPDOWN_Status,final String Step_10_Reproducibility_DROPDOWN_Verification,final String Step_10_Severity_DROPDOWN_Status,final String Step_10_Severity_DROPDOWN_Verification,final String Step_10_Priority_DROPDOWN_Status,final String Step_10_Priority_DROPDOWN_Verification,final String Step_10_Assign_to_DROPDOWN_Status,final String Step_10_Assign_to_DROPDOWN_Verification,final String Step_10_Summary_TEXT_TEXTBOX_Status,final String Step_10_Summary_TEXT_TEXTBOX_Verification,final String Step_10_Description_TEXTBOX_Status,final String Step_10_Description_TEXTBOX_Verification,final String Step_10_Platform_TEXTBOX_Status,final String Step_10_Platform_TEXTBOX_Verification,final String Step_10_OS_TEXTBOX_Status,final String Step_10_OS_TEXTBOX_Verification,final String Step_10_OS_Version_TEXTBOX_Status,final String Step_10_OS_Version_TEXTBOX_Verification,final String Step_10_Steps_to_Reproduce_TEXTBOX_Status,final String Step_10_Steps_to_Reproduce_TEXTBOX_Verification,final String Step_10_Additional_Information_TEXTBOX_Status,final String Step_10_Additional_Information_TEXTBOX_Verification,final String Step_10_Attach_Tags_TEXTBOX_Status,final String Step_10_Attach_Tags_TEXTBOX_Verification,final String Step_10_Report_Stay_CHECKBOX_Status,final String Step_10_Report_Stay_CHECKBOX_Verification,final String Step_10_Submit_Issue_BUTTON_Status,final String Step_10_Select_Profile_HYPERLINK_Status,final String Step_10_Upload_Files_HYPERLINK_Status,final String Step_10_Existing_tags_DROPDOWN_Status,final String Step_10_Existing_tags_DROPDOWN_Verification,final String Step_10_View_Status_RADIOBUTTONGROUP_Verification,final String Step_10_public_RADIOBUTTON_Status,final String Step_10_private_RADIOBUTTON_Status,final String Step_11_Category_DROPDOWN,final String Step_11_Reproducibility_DROPDOWN,final String Step_11_Severity_DROPDOWN,final String Step_11_Priority_DROPDOWN,final String Step_11_Assign_to_DROPDOWN,final String Step_11_Summary_TEXT_TEXTBOX,final String Step_11_Description_TEXTBOX,final String Step_11_Platform_TEXTBOX,final String Step_11_OS_TEXTBOX,final String Step_11_OS_Version_TEXTBOX,final String Step_11_Steps_to_Reproduce_TEXTBOX,final String Step_11_Additional_Information_TEXTBOX,final String Step_11_Attach_Tags_TEXTBOX,final String Step_11_Report_Stay_CHECKBOX,final String Step_11_Existing_tags_DROPDOWN,final String Step_11_View_Status_RADIOBUTTONGROUP) throws Exception

	{

	Launch_URL_Page launch_url_page_init=PageFactory.initElements(driver, Launch_URL_Page.class);

	Login_Screen_Page login_screen_page_init=PageFactory.initElements(driver, Login_Screen_Page.class);

	Loginpass_Screen_Page loginpass_screen_page_init=PageFactory.initElements(driver, Loginpass_Screen_Page.class);

	Issue_Submit_Page issue_submit_page_init=PageFactory.initElements(driver, Issue_Submit_Page.class);

	mantis_screen_Page mantis_screen_page_init=PageFactory.initElements(driver, mantis_screen_Page.class);

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

	testReport.generateGeneralInfo(overallTestData, "Enter_User_NameEnter_PasswordMantis_Home_Page", "TC_Enter_User_NameEnter_PasswordMantis_Home_Page", "",ne);

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

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_2");

	Reporter.log("Step - 3- Fill User Name form Login Screen screen");

	testReport.fillTableStep("Step 3", "Fill User Name form Login Screen screen");

	login_screen_page_init.set_username(Step_3_username_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_3");

	Reporter.log("Step - 4- click Login button Login Screen screen User Name form");

	testReport.fillTableStep("Step 4", "click Login button Login Screen screen User Name form");

	login_screen_page_init.click_Login();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_4");

	Reporter.log("Step - 5- verify Loginpass Screen screen");

	testReport.fillTableStep("Step 5", "verify Loginpass Screen screen");

	loginpass_screen_page_init.verify_Enter_your_password_Status(Step_5_Enter_your_password_TEXTBOX_Status);

	loginpass_screen_page_init.verify_Enter_your_password(Step_5_Enter_your_password_TEXTBOX_Verification);
	loginpass_screen_page_init.verify_Login_Status(Step_5_Login_BUTTON_Status);

	loginpass_screen_page_init.verify_Keep_me_logged_in_Status(Step_5_Keep_me_logged_in_CHECKBOX_Status);

	loginpass_screen_page_init.verify_Keep_me_logged_in(Step_5_Keep_me_logged_in_CHECKBOX_Verification);
	loginpass_screen_page_init.verify_Only_allow_your_session_to_be_used_from_this_IP_address__Status(Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Status);

	loginpass_screen_page_init.verify_Only_allow_your_session_to_be_used_from_this_IP_address_(Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Verification);
	loginpass_screen_page_init.verify_Lost_your_password__Status(Step_5_Lost_your_password__HYPERLINK_Status);

	loginpass_screen_page_init.verify_Invalid_credentials_error_message_Status(Step_5_Invalid_credentials_error_message_LABEL_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_5");

	Reporter.log("Step - 6- Fill Password form Loginpass Screen screen");

	testReport.fillTableStep("Step 6", "Fill Password form Loginpass Screen screen");

	loginpass_screen_page_init.set_Enter_your_password(Step_6_Enter_your_password_TEXTBOX);
	loginpass_screen_page_init.select_Keep_me_logged_in(Step_6_Keep_me_logged_in_CHECKBOX);
	loginpass_screen_page_init.select_Only_allow_your_session_to_be_used_from_this_IP_address_(Step_6_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_6");

	Reporter.log("Step - 7- click Login button Loginpass Screen screen Password form");

	testReport.fillTableStep("Step 7", "click Login button Loginpass Screen screen Password form");

	loginpass_screen_page_init.click_Login();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_7");

	Reporter.log("Step - 8- verify Mantis Home screen");

	testReport.fillTableStep("Step 8", "verify Mantis Home screen");

	mantis_home_page_init.verify_Issue_ID_SELF_Status(Step_8_Issue_ID_SELF_HYPERLINK_Status);

	mantis_home_page_init.verify_Issue_Name_SELF_Status(Step_8_Issue_Name_SELF_HYPERLINK_Status);

	mantis_home_page_init.verify_View_Issues_SELF_Status(Step_8_View_Issues_SELF_BUTTON_Status);

	mantis_home_page_init.verify_fghj_Status(Step_8_fghj_LABEL_Status);

	mantis_home_page_init.verify_Issue_ID_UN_Status(Step_8_Issue_ID_UN_HYPERLINK_Status);

	mantis_home_page_init.verify_Issue_Name_UN_Status(Step_8_Issue_Name_UN_HYPERLINK_Status);

	mantis_home_page_init.verify_View_Issues_UN_Status(Step_8_View_Issues_UN_BUTTON_Status);

	mantis_home_page_init.verify_Issue_ID_REP_ME_Status(Step_8_Issue_ID_REP_ME_HYPERLINK_Status);

	mantis_home_page_init.verify_Issue_Name_REP_ME_Status(Step_8_Issue_Name_REP_ME_HYPERLINK_Status);

	mantis_home_page_init.verify_View_Issues_REP_ME_Status(Step_8_View_Issues_REP_ME_BUTTON_Status);

	mantis_home_page_init.verify_Issue_ID_RES_Status(Step_8_Issue_ID_RES_HYPERLINK_Status);

	mantis_home_page_init.verify_Issue_Name_RES_Status(Step_8_Issue_Name_RES_HYPERLINK_Status);

	mantis_home_page_init.verify_View_Issues_RES_Status(Step_8_View_Issues_RES_BUTTON_Status);

	mantis_home_page_init.verify_Issue_ID_REC_Status(Step_8_Issue_ID_REC_HYPERLINK_Status);

	mantis_home_page_init.verify_Issue_Name_REC_Status(Step_8_Issue_Name_REC_HYPERLINK_Status);

	mantis_home_page_init.verify_View_Issues_REC_Status(Step_8_View_Issues_REC_BUTTON_Status);

	mantis_home_page_init.verify_Previous_Status(Step_8_Previous_BUTTON_Status);

	mantis_home_page_init.verify_username_TIMELINE_Status(Step_8_username_TIMELINE_HYPERLINK_Status);

	mantis_home_page_init.verify_Issue_ID_TIMELINE_Status(Step_8_Issue_ID_TIMELINE_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_8");

	Reporter.log("Step - 9- Select Report Issues clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	testReport.fillTableStep("Step 9", "Select Report Issues clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	mantis_home_page_init.click_Report_Issues();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_9");

	Reporter.log("Step - 10- verify Report Issue screen");

	testReport.fillTableStep("Step 10", "verify Report Issue screen");

	report_issue_page_init.verify_Category_Status(Step_10_Category_DROPDOWN_Status);

	report_issue_page_init.verify_Category(Step_10_Category_DROPDOWN_Verification);
	report_issue_page_init.verify_Reproducibility_Status(Step_10_Reproducibility_DROPDOWN_Status);

	report_issue_page_init.verify_Reproducibility(Step_10_Reproducibility_DROPDOWN_Verification);
	report_issue_page_init.verify_Severity_Status(Step_10_Severity_DROPDOWN_Status);

	report_issue_page_init.verify_Severity(Step_10_Severity_DROPDOWN_Verification);
	report_issue_page_init.verify_Priority_Status(Step_10_Priority_DROPDOWN_Status);

	report_issue_page_init.verify_Priority(Step_10_Priority_DROPDOWN_Verification);
	report_issue_page_init.verify_Assign_to_Status(Step_10_Assign_to_DROPDOWN_Status);

	report_issue_page_init.verify_Assign_to(Step_10_Assign_to_DROPDOWN_Verification);
	report_issue_page_init.verify_Summary_TEXT_Status(Step_10_Summary_TEXT_TEXTBOX_Status);

	report_issue_page_init.verify_Summary_TEXT(Step_10_Summary_TEXT_TEXTBOX_Verification);
	report_issue_page_init.verify_Description_Status(Step_10_Description_TEXTBOX_Status);

	report_issue_page_init.verify_Description(Step_10_Description_TEXTBOX_Verification);
	report_issue_page_init.verify_Platform_Status(Step_10_Platform_TEXTBOX_Status);

	report_issue_page_init.verify_Platform(Step_10_Platform_TEXTBOX_Verification);
	report_issue_page_init.verify_OS_Status(Step_10_OS_TEXTBOX_Status);

	report_issue_page_init.verify_OS(Step_10_OS_TEXTBOX_Verification);
	report_issue_page_init.verify_OS_Version_Status(Step_10_OS_Version_TEXTBOX_Status);

	report_issue_page_init.verify_OS_Version(Step_10_OS_Version_TEXTBOX_Verification);
	report_issue_page_init.verify_Steps_to_Reproduce_Status(Step_10_Steps_to_Reproduce_TEXTBOX_Status);

	report_issue_page_init.verify_Steps_to_Reproduce(Step_10_Steps_to_Reproduce_TEXTBOX_Verification);
	report_issue_page_init.verify_Additional_Information_Status(Step_10_Additional_Information_TEXTBOX_Status);

	report_issue_page_init.verify_Additional_Information(Step_10_Additional_Information_TEXTBOX_Verification);
	report_issue_page_init.verify_Attach_Tags_Status(Step_10_Attach_Tags_TEXTBOX_Status);

	report_issue_page_init.verify_Attach_Tags(Step_10_Attach_Tags_TEXTBOX_Verification);
	report_issue_page_init.verify_Report_Stay_Status(Step_10_Report_Stay_CHECKBOX_Status);

	report_issue_page_init.verify_Report_Stay(Step_10_Report_Stay_CHECKBOX_Verification);
	report_issue_page_init.verify_Submit_Issue_Status(Step_10_Submit_Issue_BUTTON_Status);

	report_issue_page_init.verify_Select_Profile_Status(Step_10_Select_Profile_HYPERLINK_Status);

	report_issue_page_init.verify_Upload_Files_Status(Step_10_Upload_Files_HYPERLINK_Status);

	report_issue_page_init.verify_Existing_tags_Status(Step_10_Existing_tags_DROPDOWN_Status);

	report_issue_page_init.verify_Existing_tags(Step_10_Existing_tags_DROPDOWN_Verification);
	report_issue_page_init.verify_View_Status(Step_10_View_Status_RADIOBUTTONGROUP_Verification);

	report_issue_page_init.verify_View_Status_public_Status(Step_10_public_RADIOBUTTON_Status);

	report_issue_page_init.verify_View_Status_private_Status(Step_10_private_RADIOBUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_10");

	Reporter.log("Step - 11- Fill Enter Issue Details form Report Issue screen");

	testReport.fillTableStep("Step 11", "Fill Enter Issue Details form Report Issue screen");

	report_issue_page_init.select_Category(Step_11_Category_DROPDOWN);
	report_issue_page_init.select_Reproducibility(Step_11_Reproducibility_DROPDOWN);
	report_issue_page_init.select_Severity(Step_11_Severity_DROPDOWN);
	report_issue_page_init.select_Priority(Step_11_Priority_DROPDOWN);
	report_issue_page_init.select_Assign_to(Step_11_Assign_to_DROPDOWN);
	report_issue_page_init.set_Summary_TEXT(Step_11_Summary_TEXT_TEXTBOX);
	report_issue_page_init.set_Description(Step_11_Description_TEXTBOX);
	report_issue_page_init.set_Platform(Step_11_Platform_TEXTBOX);
	report_issue_page_init.set_OS(Step_11_OS_TEXTBOX);
	report_issue_page_init.set_OS_Version(Step_11_OS_Version_TEXTBOX);
	report_issue_page_init.set_Steps_to_Reproduce(Step_11_Steps_to_Reproduce_TEXTBOX);
	report_issue_page_init.set_Additional_Information(Step_11_Additional_Information_TEXTBOX);
	report_issue_page_init.set_Attach_Tags(Step_11_Attach_Tags_TEXTBOX);
	report_issue_page_init.select_Report_Stay(Step_11_Report_Stay_CHECKBOX);
	report_issue_page_init.select_Existing_tags(Step_11_Existing_tags_DROPDOWN);
	report_issue_page_init.select_View_Status_Step_11_View_Status_RADIOBUTTONGROUP);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_11");

	Reporter.log("Step - 12- click Submit Issue button Report Issue screen Enter Issue Details form");

	testReport.fillTableStep("Step 12", "click Submit Issue button Report Issue screen Enter Issue Details form");

	report_issue_page_init.click_Submit_Issue();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordMantis_Home_Page","Step_12");
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
			testReport.writeTestReporthtml(overallTestData, "Enter_User_NameEnter_PasswordMantis_Home_Page");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
