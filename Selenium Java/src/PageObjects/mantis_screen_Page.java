package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class mantis_screen_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "I_tab")
	public static WebElement I_tab;

public void click_I_tab(){
		I_tab.click();
}

@FindBy(how= How.ID, using = "Site_information")
	public static WebElement Site_information;

public void verify_Site_information(String data){
		Assert.assertEquals(Site_information,Site_information);
}

public void verify_Site_information_Status(String data){
		//Verifies the Status of the Site_information
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Site_information.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Site_information.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Site_information.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Site_information.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Manage_users")
	public static WebElement Manage_users;

public void click_Manage_users(){
		Manage_users.click();
}

@FindBy(how= How.ID, using = "All")
	public static WebElement All;

public void verify_All_Status(String data){
		//Verifies the Status of the All
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(All.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(All.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!All.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!All.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_All(){
		All.click();
}

@FindBy(how= How.ID, using = "A")
	public static WebElement A;

public void verify_A_Status(String data){
		//Verifies the Status of the A
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(A.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(A.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!A.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!A.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_A(){
		A.click();
}

@FindBy(how= How.ID, using = "B")
	public static WebElement B;

public void verify_B_Status(String data){
		//Verifies the Status of the B
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(B.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(B.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!B.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!B.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_B(){
		B.click();
}

@FindBy(how= How.ID, using = "c")
	public static WebElement c;

public void verify_c_Status(String data){
		//Verifies the Status of the c
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(c.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(c.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!c.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!c.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_c(){
		c.click();
}

@FindBy(how= How.ID, using = "D")
	public static WebElement D;

public void verify_D_Status(String data){
		//Verifies the Status of the D
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(D.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(D.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!D.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!D.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_D(){
		D.click();
}

@FindBy(how= How.ID, using = "E")
	public static WebElement E;

public void verify_E_Status(String data){
		//Verifies the Status of the E
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(E.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(E.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!E.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!E.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_E(){
		E.click();
}

@FindBy(how= How.ID, using = "S")
	public static WebElement S;

public void verify_S_Status(String data){
		//Verifies the Status of the S
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(S.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(S.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!S.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!S.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_S(){
		S.click();
}

@FindBy(how= How.ID, using = "R")
	public static WebElement R;

public void verify_R_Status(String data){
		//Verifies the Status of the R
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(R.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(R.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!R.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!R.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_R(){
		R.click();
}

@FindBy(how= How.ID, using = "Q")
	public static WebElement Q;

public void verify_Q_Status(String data){
		//Verifies the Status of the Q
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Q.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Q.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Q.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Q.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Q(){
		Q.click();
}

@FindBy(how= How.ID, using = "N")
	public static WebElement N;

public void verify_N_Status(String data){
		//Verifies the Status of the N
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(N.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(N.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!N.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!N.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_N(){
		N.click();
}

@FindBy(how= How.ID, using = "M")
	public static WebElement M;

public void verify_M_Status(String data){
		//Verifies the Status of the M
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(M.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(M.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!M.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!M.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_M(){
		M.click();
}

@FindBy(how= How.ID, using = "J")
	public static WebElement J;

public void verify_J_Status(String data){
		//Verifies the Status of the J
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(J.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(J.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!J.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!J.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_J(){
		J.click();
}

@FindBy(how= How.ID, using = "L")
	public static WebElement L;

public void verify_L_Status(String data){
		//Verifies the Status of the L
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(L.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(L.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!L.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!L.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_L(){
		L.click();
}

@FindBy(how= How.ID, using = "O")
	public static WebElement O;

public void verify_O_Status(String data){
		//Verifies the Status of the O
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(O.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(O.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!O.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!O.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_O(){
		O.click();
}

@FindBy(how= How.ID, using = "I")
	public static WebElement I;

public void verify_I_Status(String data){
		//Verifies the Status of the I
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(I.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(I.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!I.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!I.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_I(){
		I.click();
}

@FindBy(how= How.ID, using = "H")
	public static WebElement H;

public void verify_H_Status(String data){
		//Verifies the Status of the H
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(H.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(H.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!H.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!H.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_H(){
		H.click();
}

@FindBy(how= How.ID, using = "P")
	public static WebElement P;

public void verify_P_Status(String data){
		//Verifies the Status of the P
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(P.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(P.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!P.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!P.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_P(){
		P.click();
}

@FindBy(how= How.ID, using = "K")
	public static WebElement K;

public void verify_K_Status(String data){
		//Verifies the Status of the K
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(K.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(K.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!K.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!K.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_K(){
		K.click();
}

@FindBy(how= How.ID, using = "G")
	public static WebElement G;

public void verify_G_Status(String data){
		//Verifies the Status of the G
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(G.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(G.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!G.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!G.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_G(){
		G.click();
}

@FindBy(how= How.ID, using = "F")
	public static WebElement F;

public void verify_F_Status(String data){
		//Verifies the Status of the F
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(F.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(F.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!F.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!F.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_F(){
		F.click();
}

@FindBy(how= How.ID, using = "T")
	public static WebElement T;

public void verify_T_Status(String data){
		//Verifies the Status of the T
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(T.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(T.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!T.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!T.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_T(){
		T.click();
}

@FindBy(how= How.ID, using = "Z")
	public static WebElement Z;

public void verify_Z_Status(String data){
		//Verifies the Status of the Z
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Z.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Z.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Z.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Z.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Z(){
		Z.click();
}

@FindBy(how= How.ID, using = "Y")
	public static WebElement Y;

public void verify_Y_Status(String data){
		//Verifies the Status of the Y
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Y.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Y.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Y.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Y.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Y(){
		Y.click();
}

@FindBy(how= How.ID, using = "One")
	public static WebElement One;

public void verify_One_Status(String data){
		//Verifies the Status of the One
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(One.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(One.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!One.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!One.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_One(){
		One.click();
}

@FindBy(how= How.ID, using = "Three")
	public static WebElement Three;

public void verify_Three_Status(String data){
		//Verifies the Status of the Three
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Three.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Three.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Three.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Three.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Three(){
		Three.click();
}

@FindBy(how= How.ID, using = "Two")
	public static WebElement Two;

public void verify_Two_Status(String data){
		//Verifies the Status of the Two
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Two.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Two.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Two.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Two.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Two(){
		Two.click();
}

@FindBy(how= How.ID, using = "U")
	public static WebElement U;

public void verify_U_Status(String data){
		//Verifies the Status of the U
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(U.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(U.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!U.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!U.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_U(){
		U.click();
}

@FindBy(how= How.ID, using = "X")
	public static WebElement X;

public void verify_X_Status(String data){
		//Verifies the Status of the X
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(X.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(X.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!X.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!X.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_X(){
		X.click();
}

@FindBy(how= How.ID, using = "V")
	public static WebElement V;

public void verify_V_Status(String data){
		//Verifies the Status of the V
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(V.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(V.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!V.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!V.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_V(){
		V.click();
}

@FindBy(how= How.ID, using = "Five")
	public static WebElement Five;

public void verify_Five_Status(String data){
		//Verifies the Status of the Five
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Five.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Five.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Five.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Five.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Five(){
		Five.click();
}

@FindBy(how= How.ID, using = "Six")
	public static WebElement Six;

public void verify_Six_Status(String data){
		//Verifies the Status of the Six
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Six.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Six.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Six.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Six.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Six(){
		Six.click();
}

@FindBy(how= How.ID, using = "Four")
	public static WebElement Four;

public void verify_Four_Status(String data){
		//Verifies the Status of the Four
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Four.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Four.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Four.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Four.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Four(){
		Four.click();
}

@FindBy(how= How.ID, using = "Eight")
	public static WebElement Eight;

public void verify_Eight_Status(String data){
		//Verifies the Status of the Eight
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Eight.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Eight.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Eight.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Eight.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Eight(){
		Eight.click();
}

@FindBy(how= How.ID, using = "Seven")
	public static WebElement Seven;

public void verify_Seven_Status(String data){
		//Verifies the Status of the Seven
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Seven.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Seven.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Seven.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Seven.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Seven(){
		Seven.click();
}

@FindBy(how= How.ID, using = "Nine")
	public static WebElement Nine;

public void verify_Nine_Status(String data){
		//Verifies the Status of the Nine
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Nine.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Nine.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Nine.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Nine.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Nine(){
		Nine.click();
}

@FindBy(how= How.ID, using = "New")
	public static WebElement New;

public void verify_New_Status(String data){
		//Verifies the Status of the New
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(New.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(New.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!New.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!New.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_New(){
		New.click();
}

@FindBy(how= How.ID, using = "unused")
	public static WebElement unused;

public void verify_unused_Status(String data){
		//Verifies the Status of the unused
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unused.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unused.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unused.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unused.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_unused(){
		unused.click();
}

@FindBy(how= How.ID, using = "Craete_account")
	public static WebElement Craete_account;

public void verify_Craete_account_Status(String data){
		//Verifies the Status of the Craete_account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Craete_account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Craete_account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Craete_account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Craete_account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Craete_account(){
		Craete_account.click();
}

@FindBy(how= How.ID, using = "Hide_Inactive")
	public static WebElement Hide_Inactive;

public void verify_Hide_Inactive(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Hide_Inactive.getAttribute("value"),data);
	}

}

public void verify_Hide_Inactive_Status(String data){
		//Verifies the Status of the Hide_Inactive
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hide_Inactive.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hide_Inactive.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hide_Inactive.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hide_Inactive.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Hide_Inactive(String data){
		if(Hide_Inactive.isSelected());
			Hide_Inactive.click();
}

@FindBy(how= How.ID, using = "Show_Disabled")
	public static WebElement Show_Disabled;

public void verify_Show_Disabled(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Show_Disabled.getAttribute("value"),data);
	}

}

public void verify_Show_Disabled_Status(String data){
		//Verifies the Status of the Show_Disabled
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_Disabled.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_Disabled.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_Disabled.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_Disabled.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Show_Disabled(String data){
		if(Show_Disabled.isSelected());
			Show_Disabled.click();
}

@FindBy(how= How.ID, using = "Username_Realname_or_Email")
	public static WebElement Username_Realname_or_Email;

public void verify_Username_Realname_or_Email(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Username_Realname_or_Email.getAttribute("value"),data);
	}

}

public void verify_Username_Realname_or_Email_Status(String data){
		//Verifies the Status of the Username_Realname_or_Email
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username_Realname_or_Email.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username_Realname_or_Email.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username_Realname_or_Email.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username_Realname_or_Email.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Username_Realname_or_Email(String data){
		Username_Realname_or_Email.clear();
		Username_Realname_or_Email.sendKeys(data);
}

@FindBy(how= How.ID, using = "Apply_Filter")
	public static WebElement Apply_Filter;

public void verify_Apply_Filter_Status(String data){
		//Verifies the Status of the Apply_Filter
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Apply_Filter.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Apply_Filter.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Apply_Filter.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Apply_Filter.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Apply_Filter(){
		Apply_Filter.click();
}

@FindBy(how= How.ID, using = "Username")
	public static WebElement Username;

public void verify_Username_Status(String data){
		//Verifies the Status of the Username
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Username(){
		Username.click();
}

@FindBy(how= How.ID, using = "Real_name")
	public static WebElement Real_name;

public void verify_Real_name_Status(String data){
		//Verifies the Status of the Real_name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Real_name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Real_name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Real_name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Real_name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Real_name(){
		Real_name.click();
}

@FindBy(how= How.ID, using = "Email")
	public static WebElement Email;

public void verify_Email_Status(String data){
		//Verifies the Status of the Email
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Email.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Email.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Email.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Email.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Email(){
		Email.click();
}

@FindBy(how= How.ID, using = "Access_Level")
	public static WebElement Access_Level;

public void verify_Access_Level_Status(String data){
		//Verifies the Status of the Access_Level
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Access_Level.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Access_Level.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Access_Level.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Access_Level.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Access_Level(){
		Access_Level.click();
}

@FindBy(how= How.ID, using = "Enabled")
	public static WebElement Enabled;

public void verify_Enabled_Status(String data){
		//Verifies the Status of the Enabled
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enabled.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enabled.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enabled.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enabled.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Enabled(){
		Enabled.click();
}

@FindBy(how= How.ID, using = "Protected")
	public static WebElement Protected;

public void verify_Protected_Status(String data){
		//Verifies the Status of the Protected
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Protected.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Protected.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Protected.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Protected.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Protected(){
		Protected.click();
}

@FindBy(how= How.ID, using = "Date_Created")
	public static WebElement Date_Created;

public void verify_Date_Created_Status(String data){
		//Verifies the Status of the Date_Created
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_Created.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_Created.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_Created.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_Created.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Date_Created(){
		Date_Created.click();
}

@FindBy(how= How.ID, using = "Last_Visit")
	public static WebElement Last_Visit;

public void verify_Last_Visit_Status(String data){
		//Verifies the Status of the Last_Visit
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_Visit.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_Visit.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_Visit.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_Visit.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Last_Visit(){
		Last_Visit.click();
}

@FindBy(how= How.ID, using = "administrator")
	public static WebElement administrator;

public void verify_administrator_Status(String data){
		//Verifies the Status of the administrator
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(administrator.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(administrator.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!administrator.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!administrator.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_administrator(){
		administrator.click();
}

@FindBy(how= How.ID, using = "Manage_Projects")
	public static WebElement Manage_Projects;

public void click_Manage_Projects(){
		Manage_Projects.click();
}

@FindBy(how= How.ID, using = "Projects")
	public static WebElement Projects;

public void click_Projects(){
		Projects.click();
}

@FindBy(how= How.ID, using = "Name_HL")
	public static WebElement Name_HL;

public void verify_Name_HL_Status(String data){
		//Verifies the Status of the Name_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Name_HL(){
		Name_HL.click();
}

@FindBy(how= How.ID, using = "Description_HL")
	public static WebElement Description_HL;

public void verify_Description_HL_Status(String data){
		//Verifies the Status of the Description_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Description_HL(){
		Description_HL.click();
}

@FindBy(how= How.ID, using = "Status_HL")
	public static WebElement Status_HL;

public void verify_Status_HL_Status(String data){
		//Verifies the Status of the Status_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Status_HL(){
		Status_HL.click();
}

@FindBy(how= How.ID, using = "Enabled_HL")
	public static WebElement Enabled_HL;

public void verify_Enabled_HL_Status(String data){
		//Verifies the Status of the Enabled_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enabled_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enabled_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enabled_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enabled_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Enabled_HL(){
		Enabled_HL.click();
}

@FindBy(how= How.ID, using = "Projectname_HL")
	public static WebElement Projectname_HL;

public void verify_Projectname_HL_Status(String data){
		//Verifies the Status of the Projectname_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Projectname_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Projectname_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Projectname_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Projectname_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Projectname_HL(){
		Projectname_HL.click();
}

@FindBy(how= How.ID, using = "View_Status_HL")
	public static WebElement View_Status_HL;

public void verify_View_Status_HL_Status(String data){
		//Verifies the Status of the View_Status_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Status_HL(){
		View_Status_HL.click();
}

@FindBy(how= How.XPATH, using = "//button[normalize-space()='Create New Project']")
	public static WebElement Create_Projects;

public void verify_Create_Projects_Status(String data){
		//Verifies the Status of the Create_Projects
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Create_Projects.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Create_Projects.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Create_Projects.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Create_Projects.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Create_Projects(){
		Create_Projects.click();
}

@FindBy(how= How.ID, using = "Edit")
	public static WebElement Edit;

public void verify_Edit_Status(String data){
		//Verifies the Status of the Edit
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit(){
		Edit.click();
}

@FindBy(how= How.ID, using = "Delete")
	public static WebElement Delete;

public void verify_Delete_Status(String data){
		//Verifies the Status of the Delete
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete(){
		Delete.click();
}

@FindBy(how= How.ID, using = "Text_global_categories_textbox")
	public static WebElement Text_global_categories_textbox;

public void verify_Text_global_categories_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Text_global_categories_textbox.getAttribute("value"),data);
	}

}

public void verify_Text_global_categories_textbox_Status(String data){
		//Verifies the Status of the Text_global_categories_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Text_global_categories_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Text_global_categories_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Text_global_categories_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Text_global_categories_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Text_global_categories_textbox(String data){
		Text_global_categories_textbox.clear();
		Text_global_categories_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_Category")
	public static WebElement Add_Category;

public void verify_Add_Category_Status(String data){
		//Verifies the Status of the Add_Category
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_Category.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_Category.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_Category.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_Category.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_Category(){
		Add_Category.click();
}

@FindBy(how= How.ID, using = "Add_and_Edit_Category")
	public static WebElement Add_and_Edit_Category;

public void verify_Add_and_Edit_Category_Status(String data){
		//Verifies the Status of the Add_and_Edit_Category
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_and_Edit_Category.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_and_Edit_Category.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_and_Edit_Category.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_and_Edit_Category.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_and_Edit_Category(){
		Add_and_Edit_Category.click();
}

@FindBy(how= How.ID, using = "Manage_Tags")
	public static WebElement Manage_Tags;

public void click_Manage_Tags(){
		Manage_Tags.click();
}

@FindBy(how= How.ID, using = "Tags")
	public static WebElement Tags;

public void click_Tags(){
		Tags.click();
}

@FindBy(how= How.ID, using = "Created_hl")
	public static WebElement Created_hl;

public void verify_Created_hl_Status(String data){
		//Verifies the Status of the Created_hl
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Created_hl.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Created_hl.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Created_hl.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Created_hl.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Created_hl(){
		Created_hl.click();
}

@FindBy(how= How.ID, using = "Date_Created_HL")
	public static WebElement Date_Created_HL;

public void verify_Date_Created_HL_Status(String data){
		//Verifies the Status of the Date_Created_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_Created_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_Created_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_Created_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_Created_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Date_Created_HL(){
		Date_Created_HL.click();
}

@FindBy(how= How.ID, using = "Dont_Care")
	public static WebElement Dont_Care;

public void verify_Dont_Care_Status(String data){
		//Verifies the Status of the Dont_Care
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Dont_Care.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Dont_Care.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Dont_Care.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Dont_Care.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Dont_Care(){
		Dont_Care.click();
}

@FindBy(how= How.ID, using = "Create_Tags")
	public static WebElement Create_Tags;

public void verify_Create_Tags_Status(String data){
		//Verifies the Status of the Create_Tags
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Create_Tags.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Create_Tags.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Create_Tags.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Create_Tags.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Create_Tags(){
		Create_Tags.click();
}

@FindBy(how= How.ID, using = "Last_Updated_HL")
	public static WebElement Last_Updated_HL;

public void verify_Last_Updated_HL_Status(String data){
		//Verifies the Status of the Last_Updated_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_Updated_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_Updated_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_Updated_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_Updated_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Last_Updated_HL(){
		Last_Updated_HL.click();
}

@FindBy(how= How.ID, using = "Name_Manage_tags_HL")
	public static WebElement Name_Manage_tags_HL;

public void verify_Name_Manage_tags_HL_Status(String data){
		//Verifies the Status of the Name_Manage_tags_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_Manage_tags_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_Manage_tags_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_Manage_tags_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_Manage_tags_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Name_Manage_tags_HL(){
		Name_Manage_tags_HL.click();
}

@FindBy(how= How.ID, using = "Name_Textbox_create_tags")
	public static WebElement Name_Textbox_create_tags;

public void verify_Name_Textbox_create_tags(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Name_Textbox_create_tags.getAttribute("value"),data);
	}

}

public void verify_Name_Textbox_create_tags_Status(String data){
		//Verifies the Status of the Name_Textbox_create_tags
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_Textbox_create_tags.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_Textbox_create_tags.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_Textbox_create_tags.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_Textbox_create_tags.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Name_Textbox_create_tags(String data){
		Name_Textbox_create_tags.clear();
		Name_Textbox_create_tags.sendKeys(data);
}

@FindBy(how= How.ID, using = "Tag_Description")
	public static WebElement Tag_Description;

public void verify_Tag_Description(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Tag_Description.getAttribute("value"),data);
	}

}

public void verify_Tag_Description_Status(String data){
		//Verifies the Status of the Tag_Description
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_Description.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_Description.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_Description.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_Description.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Tag_Description(String data){
		Tag_Description.clear();
		Tag_Description.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='project-name']")
	public static WebElement projectnameTX;

public void verify_projectnameTX(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(projectnameTX.getAttribute("value"),data);
	}

}

public void verify_projectnameTX_Status(String data){
		//Verifies the Status of the projectnameTX
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(projectnameTX.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(projectnameTX.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!projectnameTX.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!projectnameTX.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_projectnameTX(String data){
		projectnameTX.clear();
		projectnameTX.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='project-description']")
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

@FindBy(how= How.XPATH, using = "//input[@value='Add Project']")
	public static WebElement Add_project;

public void verify_Add_project_Status(String data){
		//Verifies the Status of the Add_project
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_project.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_project.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_project.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_project.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_project(){
		Add_project.click();
}

@FindBy(how= How.ID, using = "CA_username")
	public static WebElement CA_username;

public void verify_CA_username(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_username.getAttribute("value"),data);
	}

}

public void verify_CA_username_Status(String data){
		//Verifies the Status of the CA_username
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_username.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_username.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_username.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_username.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_CA_username(String data){
		CA_username.clear();
		CA_username.sendKeys(data);
}

@FindBy(how= How.ID, using = "CA_realname")
	public static WebElement CA_realname;

public void verify_CA_realname(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_realname.getAttribute("value"),data);
	}

}

public void verify_CA_realname_Status(String data){
		//Verifies the Status of the CA_realname
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_realname.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_realname.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_realname.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_realname.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_CA_realname(String data){
		CA_realname.clear();
		CA_realname.sendKeys(data);
}

@FindBy(how= How.ID, using = "CA_Email")
	public static WebElement CA_Email;

public void verify_CA_Email(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_Email.getAttribute("value"),data);
	}

}

public void verify_CA_Email_Status(String data){
		//Verifies the Status of the CA_Email
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_Email.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_Email.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_Email.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_Email.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_CA_Email(String data){
		CA_Email.clear();
		CA_Email.sendKeys(data);
}

@FindBy(how= How.ID, using = "CA_Enable")
	public static WebElement CA_Enable;

public void verify_CA_Enable(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_Enable.getAttribute("value"),data);
	}

}

public void verify_CA_Enable_Status(String data){
		//Verifies the Status of the CA_Enable
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_Enable.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_Enable.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_Enable.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_Enable.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_CA_Enable(String data){
		if(CA_Enable.isSelected());
			CA_Enable.click();
}

@FindBy(how= How.ID, using = "CA_Protected")
	public static WebElement CA_Protected;

public void verify_CA_Protected(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_Protected.getAttribute("value"),data);
	}

}

public void verify_CA_Protected_Status(String data){
		//Verifies the Status of the CA_Protected
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_Protected.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_Protected.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_Protected.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_Protected.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_CA_Protected(String data){
		if(CA_Protected.isSelected());
			CA_Protected.click();
}

@FindBy(how= How.ID, using = "AcessLevel_CA")
	public static WebElement AcessLevel_CA;

public void verify_AcessLevel_CA(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AcessLevel_CA.getAttribute("value"),data);
	}

}

public void verify_AcessLevel_CA_Status(String data){
		//Verifies the Status of the AcessLevel_CA
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AcessLevel_CA.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AcessLevel_CA.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AcessLevel_CA.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AcessLevel_CA.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_AcessLevel_CA(String data){
		Select dropdown= new Select(AcessLevel_CA);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Manage_Custom_Fields")
	public static WebElement Manage_Custom_Fields;

public void click_Manage_Custom_Fields(){
		Manage_Custom_Fields.click();
}

@FindBy(how= How.ID, using = "Type")
	public static WebElement Type;

public void verify_Type_Status(String data){
		//Verifies the Status of the Type
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Type.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Type.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Type.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Type.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Type(){
		Type.click();
}

@FindBy(how= How.ID, using = "Name")
	public static WebElement Name;

public void verify_Name_Status(String data){
		//Verifies the Status of the Name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Name(){
		Name.click();
}

@FindBy(how= How.ID, using = "Default_values")
	public static WebElement Default_values;

public void verify_Default_values_Status(String data){
		//Verifies the Status of the Default_values
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Default_values.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Default_values.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Default_values.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Default_values.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Default_values(){
		Default_values.click();
}

@FindBy(how= How.ID, using = "Possilbe_values")
	public static WebElement Possilbe_values;

public void verify_Possilbe_values_Status(String data){
		//Verifies the Status of the Possilbe_values
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Possilbe_values.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Possilbe_values.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Possilbe_values.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Possilbe_values.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Possilbe_values(){
		Possilbe_values.click();
}

@FindBy(how= How.ID, using = "Project_Count")
	public static WebElement Project_Count;

public void verify_Project_Count_Status(String data){
		//Verifies the Status of the Project_Count
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_Count.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_Count.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_Count.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_Count.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Project_Count(){
		Project_Count.click();
}

@FindBy(how= How.ID, using = "Enter_Field")
	public static WebElement Enter_Field;

public void verify_Enter_Field(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Enter_Field.getAttribute("value"),data);
	}

}

public void verify_Enter_Field_Status(String data){
		//Verifies the Status of the Enter_Field
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enter_Field.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enter_Field.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enter_Field.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enter_Field.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Enter_Field(String data){
		Enter_Field.clear();
		Enter_Field.sendKeys(data);
}

@FindBy(how= How.ID, using = "NewCustomField")
	public static WebElement NewCustomField;

public void verify_NewCustomField_Status(String data){
		//Verifies the Status of the NewCustomField
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(NewCustomField.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(NewCustomField.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!NewCustomField.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!NewCustomField.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_NewCustomField(){
		NewCustomField.click();
}

@FindBy(how= How.ID, using = "Name")
	public static WebElement Name;

public void verify_Name(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Name.getAttribute("value"),data);
	}

}

public void verify_Name_Status(String data){
		//Verifies the Status of the Name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Name(String data){
		Name.clear();
		Name.sendKeys(data);
}

@FindBy(how= How.ID, using = "Type")
	public static WebElement Type;

public void verify_Type(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Type.getAttribute("value"),data);
	}

}

public void verify_Type_Status(String data){
		//Verifies the Status of the Type
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Type.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Type.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Type.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Type.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Type(String data){
		Type.clear();
		Type.sendKeys(data);
}

@FindBy(how= How.ID, using = "Possible_values")
	public static WebElement Possible_values;

public void verify_Possible_values(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Possible_values.getAttribute("value"),data);
	}

}

public void verify_Possible_values_Status(String data){
		//Verifies the Status of the Possible_values
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Possible_values.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Possible_values.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Possible_values.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Possible_values.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Possible_values(String data){
		Possible_values.clear();
		Possible_values.sendKeys(data);
}

@FindBy(how= How.ID, using = "Default_values")
	public static WebElement Default_values;

public void verify_Default_values(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Default_values.getAttribute("value"),data);
	}

}

public void verify_Default_values_Status(String data){
		//Verifies the Status of the Default_values
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Default_values.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Default_values.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Default_values.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Default_values.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Default_values(String data){
		Default_values.clear();
		Default_values.sendKeys(data);
}

@FindBy(how= How.ID, using = "Regular_Expression")
	public static WebElement Regular_Expression;

public void verify_Regular_Expression(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Regular_Expression.getAttribute("value"),data);
	}

}

public void verify_Regular_Expression_Status(String data){
		//Verifies the Status of the Regular_Expression
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Regular_Expression.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Regular_Expression.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Regular_Expression.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Regular_Expression.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Regular_Expression(String data){
		Regular_Expression.clear();
		Regular_Expression.sendKeys(data);
}

@FindBy(how= How.ID, using = "Max_length")
	public static WebElement Max_length;

public void verify_Max_length(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Max_length.getAttribute("value"),data);
	}

}

public void verify_Max_length_Status(String data){
		//Verifies the Status of the Max_length
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Max_length.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Max_length.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Max_length.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Max_length.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Max_length(String data){
		Max_length.clear();
		Max_length.sendKeys(data);
}

@FindBy(how= How.ID, using = "Min_length")
	public static WebElement Min_length;

public void verify_Min_length(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Min_length.getAttribute("value"),data);
	}

}

public void verify_Min_length_Status(String data){
		//Verifies the Status of the Min_length
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Min_length.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Min_length.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Min_length.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Min_length.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Min_length(String data){
		Min_length.clear();
		Min_length.sendKeys(data);
}

@FindBy(how= How.ID, using = "WriteAccess")
	public static WebElement WriteAccess;

public void verify_WriteAccess(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(WriteAccess.getAttribute("value"),data);
	}

}

public void verify_WriteAccess_Status(String data){
		//Verifies the Status of the WriteAccess
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(WriteAccess.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(WriteAccess.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!WriteAccess.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!WriteAccess.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_WriteAccess(String data){
		Select dropdown= new Select(WriteAccess);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Readaccess")
	public static WebElement Readaccess;

public void verify_Readaccess(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Readaccess.getAttribute("value"),data);
	}

}

public void verify_Readaccess_Status(String data){
		//Verifies the Status of the Readaccess
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Readaccess.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Readaccess.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Readaccess.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Readaccess.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Readaccess(String data){
		Select dropdown= new Select(Readaccess);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Add_filter")
	public static WebElement Add_filter;

public void verify_Add_filter(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Add_filter.getAttribute("value"),data);
	}

}

public void verify_Add_filter_Status(String data){
		//Verifies the Status of the Add_filter
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_filter.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_filter.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_filter.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_filter.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Add_filter(String data){
		if(Add_filter.isSelected());
			Add_filter.click();
}

@FindBy(how= How.ID, using = "Display_When_Reporting_Issues")
	public static WebElement Display_When_Reporting_Issues;

public void verify_Display_When_Reporting_Issues(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Reporting_Issues.getAttribute("value"),data);
	}

}

public void verify_Display_When_Reporting_Issues_Status(String data){
		//Verifies the Status of the Display_When_Reporting_Issues
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Reporting_Issues.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Reporting_Issues.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Reporting_Issues.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Reporting_Issues.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Display_When_Reporting_Issues(String data){
		if(Display_When_Reporting_Issues.isSelected());
			Display_When_Reporting_Issues.click();
}

@FindBy(how= How.ID, using = "Display_When_Updating_Issues")
	public static WebElement Display_When_Updating_Issues;

public void verify_Display_When_Updating_Issues(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Updating_Issues.getAttribute("value"),data);
	}

}

public void verify_Display_When_Updating_Issues_Status(String data){
		//Verifies the Status of the Display_When_Updating_Issues
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Updating_Issues.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Updating_Issues.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Updating_Issues.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Updating_Issues.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Display_When_Updating_Issues(String data){
		Display_When_Updating_Issues.clear();
		Display_When_Updating_Issues.sendKeys(data);
}

@FindBy(how= How.ID, using = "Display_When_Resolving_Issues")
	public static WebElement Display_When_Resolving_Issues;

public void verify_Display_When_Resolving_Issues(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Resolving_Issues.getAttribute("value"),data);
	}

}

public void verify_Display_When_Resolving_Issues_Status(String data){
		//Verifies the Status of the Display_When_Resolving_Issues
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Resolving_Issues.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Resolving_Issues.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Resolving_Issues.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Resolving_Issues.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Display_When_Resolving_Issues(String data){
		if(Display_When_Resolving_Issues.isSelected());
			Display_When_Resolving_Issues.click();
}

@FindBy(how= How.ID, using = "Display_When_Closing_Issues")
	public static WebElement Display_When_Closing_Issues;

public void verify_Display_When_Closing_Issues(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Closing_Issues.getAttribute("value"),data);
	}

}

public void verify_Display_When_Closing_Issues_Status(String data){
		//Verifies the Status of the Display_When_Closing_Issues
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Closing_Issues.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Closing_Issues.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Closing_Issues.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Closing_Issues.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Display_When_Closing_Issues(String data){
		if(Display_When_Closing_Issues.isSelected());
			Display_When_Closing_Issues.click();
}

@FindBy(how= How.ID, using = "Required_On_Report")
	public static WebElement Required_On_Report;

public void verify_Required_On_Report(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Report.getAttribute("value"),data);
	}

}

public void verify_Required_On_Report_Status(String data){
		//Verifies the Status of the Required_On_Report
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Report.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Report.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Report.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Report.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Report(String data){
		if(Required_On_Report.isSelected());
			Required_On_Report.click();
}

@FindBy(how= How.ID, using = "Required_On_Update")
	public static WebElement Required_On_Update;

public void verify_Required_On_Update(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Update.getAttribute("value"),data);
	}

}

public void verify_Required_On_Update_Status(String data){
		//Verifies the Status of the Required_On_Update
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Update.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Update.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Update.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Update.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Update(String data){
		if(Required_On_Update.isSelected());
			Required_On_Update.click();
}

@FindBy(how= How.ID, using = "Required_On_Resolve")
	public static WebElement Required_On_Resolve;

public void verify_Required_On_Resolve(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Resolve.getAttribute("value"),data);
	}

}

public void verify_Required_On_Resolve_Status(String data){
		//Verifies the Status of the Required_On_Resolve
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Resolve.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Resolve.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Resolve.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Resolve.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Resolve(String data){
		if(Required_On_Resolve.isSelected());
			Required_On_Resolve.click();
}

@FindBy(how= How.ID, using = "Required_On_Close")
	public static WebElement Required_On_Close;

public void verify_Required_On_Close(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Close.getAttribute("value"),data);
	}

}

public void verify_Required_On_Close_Status(String data){
		//Verifies the Status of the Required_On_Close
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Close.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Close.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Close.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Close.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Close(String data){
		if(Required_On_Close.isSelected());
			Required_On_Close.click();
}

@FindBy(how= How.ID, using = "UpdateCustomField")
	public static WebElement UpdateCustomField;

public void verify_UpdateCustomField_Status(String data){
		//Verifies the Status of the UpdateCustomField
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(UpdateCustomField.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(UpdateCustomField.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!UpdateCustomField.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!UpdateCustomField.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_UpdateCustomField(){
		UpdateCustomField.click();
}

@FindBy(how= How.ID, using = "Delete_Custom_Field")
	public static WebElement Delete_Custom_Field;

public void verify_Delete_Custom_Field_Status(String data){
		//Verifies the Status of the Delete_Custom_Field
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_Custom_Field.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_Custom_Field.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_Custom_Field.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_Custom_Field.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_Custom_Field(){
		Delete_Custom_Field.click();
}

@FindBy(how= How.ID, using = "Remove")
	public static WebElement Remove;

public void verify_Remove_Status(String data){
		//Verifies the Status of the Remove
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Remove.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Remove.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Remove.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Remove.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Remove(){
		Remove.click();
}

@FindBy(how= How.ID, using = "Project_CF")
	public static WebElement Project_CF;

public void verify_Project_CF_Status(String data){
		//Verifies the Status of the Project_CF
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_CF.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_CF.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_CF.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_CF.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Project_CF(){
		Project_CF.click();
}

@FindBy(how= How.ID, using = "Sequence")
	public static WebElement Sequence;

public void verify_Sequence(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Sequence.getAttribute("value"),data);
	}

}

public void verify_Sequence_Status(String data){
		//Verifies the Status of the Sequence
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sequence.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sequence.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sequence.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sequence.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Sequence(String data){
		Sequence.clear();
		Sequence.sendKeys(data);
}

@FindBy(how= How.ID, using = "LinkCustomField")
	public static WebElement LinkCustomField;

public void verify_LinkCustomField_Status(String data){
		//Verifies the Status of the LinkCustomField
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LinkCustomField.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LinkCustomField.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LinkCustomField.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LinkCustomField.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LinkCustomField(){
		LinkCustomField.click();
}

@FindBy(how= How.ID, using = "Administrator_WA")
	public static WebElement Administrator_WA;

public void verify_Administrator_WA_Status(String data){
		//Verifies the Status of the Administrator_WA
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Administrator_WA.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Administrator_WA.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Administrator_WA.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Administrator_WA.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Administrator_WA(){
		Administrator_WA.click();
}

@FindBy(how= How.ID, using = "Administrator_RA")
	public static WebElement Administrator_RA;

public void verify_Administrator_RA_Status(String data){
		//Verifies the Status of the Administrator_RA
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Administrator_RA.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Administrator_RA.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Administrator_RA.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Administrator_RA.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Administrator_RA(){
		Administrator_RA.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}