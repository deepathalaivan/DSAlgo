package stepdefinition;


import org.junit.Assert;

import com.drivermanager.DriverManagerFact;
import com.pages.BasePage;
import com.pages.TreePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDefinition  {
	
	//TreeStepDefinition treeSD = new TreeStepDefinition();
	
	private TreePage treePage = new TreePage();
	
	
	
	
	
	@Then("The user should be redirected to Homepage")
	public void the_user_should_be_redirected_to_homepage() {
		Assert.assertEquals("NumpyNinja",treePage.getPageTitle());
	}
	
	@Given("The user comes back to the DS_algo home page to select or start DS Tree")
	public void the_user_comes_back_to_the_ds_algo_home_page_to_select_or_start_ds_tree() {
		Assert.assertEquals("Home",treePage.getPageTitle());

	}

	@When("The user select \"\"Tree\"\" from the Data Structure dropdown menu clicks the \"\"Get Started\"\" button in Tree Panel\"")
	public void the_user_select_tree_from_the_data_structure_dropdown_menu_clicks_the_get_started_button_in_tree_panel() {
		treePage.clickGetStarted();
	}

	@Then("The user should be redirected to \"\"Tree\"\" page.\"")
	public void the_user_should_be_redirected_to_tree_page() {
		Assert.assertEquals("Tree",treePage.getPageTitle());

	}
	

	@Given("The user is on the \"\"Tree\"\" page")
	public void the_user_is_on_the_tree_page() {
		Assert.assertEquals("Tree",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Overview of Trees\"\" link")
	public void the_user_clicks_overview_of_trees_link() {
	   treePage.clickOnOverviewTrees();
	}

	@Then("The user should be redirected to \"\"Overview of Trees\"\" page.\"")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
		Assert.assertEquals("Overview of Trees",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Overview of Trees\"\" page")
	public void the_user_is_on_the_overview_of_trees_page() {
		Assert.assertEquals("Overview of Trees",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Try Here\"\" button")
	public void the_user_clicks_try_here_button() {
	    treePage.clickTryHere();
	}

	@Then("The user should be redirected to a page having Editor and run button")
	public void the_user_should_be_redirected_to_a_page_having_editor_and_run_button() {
		Assert.assertEquals("Assessment",treePage.getPageTitle());

	}

	@Given("The user is on the Python Editor")
	public void the_user_is_on_the_python_editor() {
		Assert.assertEquals("Assessment",treePage.getPageTitle());

	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	   treePage.clickRun();
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
		Assert.assertEquals("Assessment",treePage.getPageTitle());

	}

	@Given("The user is on the editor page")
	public void the_user_is_on_the_editor_page() {
		Assert.assertEquals("Assessment",treePage.getPageTitle());
		treePage.clickEditor();

	}

	@When("The user writes the valid python code	and click run button")
	public void the_user_writes_the_valid_python_code_and_click_run_button() {
	    treePage.enterPyCode();
	    treePage.clickRun();
	}

	@Then("The user is able to see the output inside the console.")
	public void the_user_is_able_to_see_the_output_inside_the_console() {
		 treePage.output();
	}

	@When("The user writes the invalid python code and click run button")
	public void the_user_writes_the_invalid_python_code_and_click_run_button() {
		treePage.enterInvaliPyCode();
    treePage.clickRun();

	}

	@Then("The user see error msg in alert window")
	public void the_user_see_error_msg_in_alert_window() {
	treePage.getAlertText();

	}

	@Given("The user is on the editor page with Alert error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
		Assert.assertEquals("Assessment",treePage.getPageTitle());

	}

	@When("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
	   treePage.acceptAlertText();
	}

	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
		Assert.assertEquals("Assessment",treePage.getPageTitle());

	}

	@Given("The user go back and is on the \"\"Overview of Trees\"\" page")
	public void the_user_go_back_and_is_on_the_overview_of_trees_page() {
		treePage.navigateBack();
	}

	@When("The user clicks \"\"Terminologies\"\" link\"")
	public void the_user_clicks_terminologies_link() {
		treePage.clickTerminologies();
	}

	@Then("The user should be redirected to \"\"Terminologies\"\" page.\"")
	public void the_user_should_be_redirected_to_terminologies_page() {
		Assert.assertEquals("Terminologies",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Terminologies\"\" page\"")
	public void the_user_is_on_the_terminologies_page() {
		Assert.assertEquals("Terminologies",treePage.getPageTitle());

	}

//	@When("The user clicks \"\"Try Here\"\" button\"")
//	public void the_user_clicks_try_here_button() {
//	    
//	}

	@When("The user clicks the Run Button without entring the code in the Editor")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
	   treePage.clickRun();
	}

	@When("The user writes the valid python code	click run button")
	public void the_user_writes_the_valid_python_code_click_run_button() {
	    treePage.enterPyCode();
	    treePage.clickRun();
	}

	@When("The user clicks \"\"Types of Trees\"\" link\"")
	public void the_user_clicks_types_of_trees_link() {
	    treePage.clickTypesOfTree();
	}

	@Then("The user should be redirected to \"\"Types of Trees\"\" page.\"")
	public void the_user_should_be_redirected_to_types_of_trees_page() {
		Assert.assertEquals("Types of Trees",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Types of Trees\"\" page\"")
	public void the_user_is_on_the_types_of_trees_page() {
		Assert.assertEquals("Types of Trees",treePage.getPageTitle());

	}

//	@When("The user writes the valid python code	 and click run button")
//	public void the_user_writes_the_valid_python_code_and_click_run_button() {
//	   
//	}

	@When("The user clicks \"\"Tree Traversals\"\" link\"")
	public void the_user_clicks_tree_traversals_link() {
	    treePage.clickTreeTraversals();
	}

	@Then("The user should be redirected to \"\"Tree Traversals\"\" page.\"")
	public void the_user_should_be_redirected_to_tree_traversals_page() {
		Assert.assertEquals("Tree Traversals",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Tree Traversals\"\" page\"")
	public void the_user_is_on_the_tree_traversals_page() {
		Assert.assertEquals("Tree Traversals",treePage.getPageTitle());

	}

//	@When("The user writes the valid python code and click run button")
//	public void the_user_writes_the_valid_python_code_and_click_run_button() {
//	   
//	}

	@When("The user clicks \"\"Traversals-Illustration\"\" link\"")
	public void the_user_clicks_traversals_illustration_link() {
	    treePage.clickTraversalIllust();
	}

	@Then("The user should be redirected to \"\"Traversals-Illustration\"\" page.\"s")
	public void the_user_should_be_redirected_to_traversals_illustration_page_s() {
		Assert.assertEquals("Traversals-Illustration",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Traversals-Illustration\"\" page\"")
	public void the_user_is_on_the_traversals_illustration_page() {
		Assert.assertEquals("Traversals-Illustration",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Binary Trees\"\" link\"")
	public void the_user_clicks_binary_trees_link() {
	    treePage.clickBinaryTree();
	}

	@Then("The user should be redirected to \"\"Binary Trees\"\" page.\"")
	public void the_user_should_be_redirected_to_binary_trees_page() {
		Assert.assertEquals("Binary Trees",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Binary Trees\"\" page\"")
	public void the_user_is_on_the_binary_trees_page() {
		Assert.assertEquals("Binary Trees",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Types of Binary Trees\"\" link\"")
	public void the_user_clicks_types_of_binary_trees_link() {
	   treePage.clickTypesBinaryTree();
	}

	@Then("The user should be redirected to \"\"Types of Binary Trees\"\" page.\"")
	public void the_user_should_be_redirected_to_types_of_binary_trees_page() {
		Assert.assertEquals("Types of Binary Trees",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Types of Binary Trees\"\" page\"")
	public void the_user_is_on_the_types_of_binary_trees_page() {
		Assert.assertEquals("Types of Binary Trees",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Implementation in Python Trees\"\" link\"")
	public void the_user_clicks_implementation_in_python_trees_link() {
	    treePage.clickImplementPy();
	}

	@Then("The user should be redirected to \"\"Implementation in Python\"\" page.\"")
	public void the_user_should_be_redirected_to_implementation_in_python_page() {
		Assert.assertEquals("Implementation in Python",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Implementation in Python\"\" page\"")
	public void the_user_is_on_the_implementation_in_python_page() {
		Assert.assertEquals("Implementation in Python",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Binary Tree Traversals\"\" link\"")
	public void the_user_clicks_binary_tree_traversals_link() {
	    treePage.clickBinaryTreeTravers();
	}

	@Then("The user should be redirected to \"\"Binary Tree Traversals\"\" page.\"")
	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
		Assert.assertEquals("Binary Tree Traversals",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Binary Tree Traversals\"\" page\"")
	public void the_user_is_on_the_binary_tree_traversals_page() {
		Assert.assertEquals("Binary Tree Traversals",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Implementation of Binary Trees\"\" link\"")
	public void the_user_clicks_implementation_of_binary_trees_link() {
	   treePage.clickImplementBinaryTree();
	}

	@Then("The user should be redirected to \"\"Implementation of Binary Trees\"\" page.\"")
	public void the_user_should_be_redirected_to_implementation_of_binary_trees_page() {
		Assert.assertEquals("Implementation of Binary Trees",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Implementation of Binary Trees\"\" page\"")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {
		Assert.assertEquals("Implementation of Binary Trees",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Applications of Binary trees\"\" link\"")
	public void the_user_clicks_applications_of_binary_trees_link() {
	    treePage.clickApplicatnBiTree();
	}

	@Then("The user should be redirected to \"\"Applications of Binary trees\"\" page.\"")
	public void the_user_should_be_redirected_to_applications_of_binary_trees_page() {
		Assert.assertEquals("Applications of Binary trees",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Applications of Binary trees\"\" page\"")
	public void the_user_is_on_the_applications_of_binary_trees_page() {
		Assert.assertEquals("Applications of Binary trees",treePage.getPageTitle());

	}

	@When("The user writes the invalid python code	click run button")
	public void the_user_writes_the_invalid_python_code_click_run_button() {
	    treePage.enterInvaliPyCode();
	    treePage.clickRun();
	}

	@When("The user clicks \"\"Binary Search Trees\"\" link\"")
	public void the_user_clicks_binary_search_trees_link() {
	   treePage.clickBinarySearchTree();
	}

	@Then("The user should be redirected to \"\"Binary Search Trees\"\" page.\"")
	public void the_user_should_be_redirected_to_binary_search_trees_page() {
		Assert.assertEquals("Binary Search Trees",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Binary Search Trees\"\" page\"")
	public void the_user_is_on_the_binary_search_trees_page() {
		Assert.assertEquals("Binary Search Trees",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Implementation Of BST\"\" link\"")
	public void the_user_clicks_implementation_of_bst_link() {
	   treePage.clickImplementatnBST();
	}

	@Then("The user should be redirected to \"\"Implementation Of BST\"\" page.\"")
	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
		Assert.assertEquals("Implementation Of BST",treePage.getPageTitle());

	}

	@Given("The user is on the \"\"Implementation Of BST\"\" page\"")
	public void the_user_is_on_the_implementation_of_bst_page() {
		Assert.assertEquals("Implementation Of BST",treePage.getPageTitle());

	}

	@When("The user clicks \"\"Practice Questions\"\" link\"")
	public void the_user_clicks_practice_questions_link() {
	    treePage.clickPractiseQ();
	}

	@Then("The user should be redirected to \"\"Practice Questions\"\" page.\"")
	public void the_user_should_be_redirected_to_practice_questions_page() {
		Assert.assertEquals("Practice Questions",treePage.getPageTitle());

	}
	
	
	
	
	
//	@Given("The user comes back to the DS_algo home page to select or start DS Tree")
//	public void the_user_comes_back_to_the_ds_algo_home_page_to_select_or_start_ds_tree() {
//		treePage.enterLoginCreds("sdetninjas", "ninjas@123");
//		
//	}
//	
//
//	@When("The user select \"\"Tree\"\" from the Data Structure dropdown menu clicks the \"\"Get Started\"\" button in Tree Panel\"")
//	public void the_user_select_tree_from_the_data_structure_dropdown_menu_clicks_the_get_started_button_in_tree_panel() {
//		treePage.clickGetStarted();
//	}
//
//	@Then("The user should be redirected to \"\"Tree\"\" page.\"")
//	public void the_user_should_be_redirected_to_tree_page() {
//		Assert.assertEquals("Tree",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Tree\"\" page")
//	public void the_user_is_on_the_tree_page() {
//		Assert.assertEquals("Tree",treePage.getPageTitle());
//	}
//
//	@When("The user clicks \"\"Overview of Trees\"\" link")
//	public void the_user_clicks_overview_of_trees_link() {
//		treePage.clickOnOverviewTrees();
//	}
//
//	@Then("The user should be redirected to \"\"Overview of Trees\"\" page.\"")
//	public void the_user_should_be_redirected_to_overview_of_trees_page() {
//		Assert.assertEquals("Overview of Trees",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Overview of Trees\"\" page")
//	public void the_user_is_on_the_overview_of_trees_page() {
//		Assert.assertEquals("Overview of Trees",treePage.getPageTitle());
//	}
//
//	@When("The user clicks \"\"Try Here\"\" button")
//	public void the_user_clicks_try_here_button() {
//		treePage.clickTryHere();
//	}
//
//	@Then("The user should be redirected to a page having Editor and run button")
//	public void the_user_should_be_redirected_to_a_page_having_editor_and_run_button() {
//		Assert.assertEquals("Assesment",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the Python Editor")
//	public void the_user_is_on_the_python_editor() {
//		treePage.clickEditor();
//	}
//
//	@When("The user clicks the Run Button without entering the code in the Editor")
//	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
//	    treePage.clickRun();
//	}
//
//	@Then("Nothing happens to the page and no error message is displayed")
//	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
//		Assert.assertEquals("Overview of Trees",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the editor page")
//	public void the_user_is_on_the_editor_page() {
//		treePage.clickEditor();
//
//	}
//
//	@When("The user writes the valid python code	and click run button")
//	public void the_user_writes_the_valid_python_code_and_click_run_button() {
//		treePage.enterPyCode();
//		treePage.clickRun();
//	}
//
//	@Then("The user is able to see the output inside the console.")
//	public void the_user_is_able_to_see_the_output_inside_the_console() {
//	    treePage.output();
//	}
//
//	@When("The user writes the invalid python code and click run button")
//	public void the_user_writes_the_invalid_python_code_and_click_run_button() {
//	    treePage.enterInvaliPyCode();
//	    treePage.clickRun();
//	}
//
//	@Then("The user see error msg in alert window")
//	public void the_user_see_error_msg_in_alert_window() {
//		treePage.getAlertText();
//		
//	}
//
//	@Given("The user is on the editor page with Alert error message")
//	public void the_user_is_on_the_editor_page_with_alert_error_message() {
//		treePage.getAlertText();
//	
//	}
//
//	@When("The user click the ok button in the alert window")
//	public void the_user_click_the_ok_button_in_the_alert_window() {
//		treePage.acceptAlertText();
//	}
//
//	@Then("The user is on the same page having Editor and Run button")
//	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
//		Assert.assertEquals("Assessment",treePage.getPageTitle());
//
//	}
//
//	@Given("The user go back and is on the \"\"Overview of Trees\"\" page")
//	public void the_user_go_back_and_is_on_the_overview_of_trees_page() {
//		treePage.navigateBack();
//	}
//
//	@When("The user clicks \"\"Terminologies\"\" link\"")
//	public void the_user_clicks_terminologies_link() {
//	   treePage.clickTerminologies();
//	}
//
//	@Then("The user should be redirected to \"\"Terminologies\"\" page.\"")
//	public void the_user_should_be_redirected_to_terminologies_page() {
//		Assert.assertEquals("Terminologies",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Terminologies\"\" page\"")
//	public void the_user_is_on_the_terminologies_page() {
//		Assert.assertEquals("Terminologies",treePage.getPageTitle());
//	}
//
////	@When("The user clicks \"\"Try Here\"\" button")
////	public void the_user_clicks_try_here_button2() {
////		treePage.clickTryHere();
////	}
//
//	@When("The user clicks the Run Button without entring the code in the Editor")
//	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
//	    treePage.clickRun();
//	}
//
//	@When("The user writes the valid python code	click run button")
//	public void the_user_writes_the_valid_python_code_click_run_button() {
//	    treePage.enterPyCode();
//	    treePage.clickRun();
//	}
//
//	@When("The user clicks \"\"Types of Trees\"\" link\"")
//	public void the_user_clicks_types_of_trees_link() {
//	    treePage.clickTypesOfTree();
//	}
//
//	@Then("The user should be redirected to \"\"Types of Trees\"\" page.\"")
//	public void the_user_should_be_redirected_to_types_of_trees_page() {
//		Assert.assertEquals("Types of Trees",treePage.getPageTitle());
//
//		
//	}
//
//	@Given("The user is on the \"\"Types of Trees\"\" page\"")
//	public void the_user_is_on_the_types_of_trees_page() {
//		Assert.assertEquals("Types of Trees",treePage.getPageTitle());
//
//	}
//
////	@When("The user clicks \"\"Try Here\"\" button")
////	public void the_user_clicks_try_here_button3() {
////		treePage.clickTryHere();
////	}
//
//	@When("The user clicks \"\"Tree Traversals\"\" link\"")
//	public void the_user_clicks_tree_traversals_link() {
//	   treePage.clickTreeTraversals();
//	}
//
//	@Then("The user should be redirected to \"\"Tree Traversals\"\" page.\"")
//	public void the_user_should_be_redirected_to_tree_traversals_page() {
//		Assert.assertEquals("Tree Traversals",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Tree Traversals\"\" page\"")
//	public void the_user_is_on_the_tree_traversals_page() {
//		Assert.assertEquals("Tree Traversals",treePage.getPageTitle());
//
//	}
//
////	@When("The user writes the valid python code and click run button")
////	public void the_user_writes_the_valid_python_code_and_click_run_button4() {
////    		treePage.clickTryHere();
////
////	}
//
//	@When("The user clicks \"\"Traversals-Illustration\"\" link\"")
//	public void the_user_clicks_traversals_illustration_link() {
//	    treePage.clickTraversalIllust();
//	}
//
//	@Then("The user should be redirected to \"\"Traversals-Illustration\"\" page.\"s")
//	public void the_user_should_be_redirected_to_traversals_illustration_page_s() {
//		Assert.assertEquals("Traversals-Illustration",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Traversals-Illustration\"\" page\"")
//	public void the_user_is_on_the_traversals_illustration_page() {
//		Assert.assertEquals("Traversals-Illustration",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Binary Trees\"\" link\"")
//	public void the_user_clicks_binary_trees_link() {
//	    treePage.clickBinaryTree();
//	}
//
//	@Then("The user should be redirected to \"\"Binary Trees\"\" page.\"")
//	public void the_user_should_be_redirected_to_binary_trees_page() {
//		Assert.assertEquals("Binary Trees",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Binary Trees\"\" page\"")
//	public void the_user_is_on_the_binary_trees_page() {
//		Assert.assertEquals("Binary Trees",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Types of Binary Trees\"\" link\"")
//	public void the_user_clicks_types_of_binary_trees_link() {
//		treePage.clickTypesBinaryTree();
//	}
//
//	@Then("The user should be redirected to \"\"Types of Binary Trees\"\" page.\"")
//	public void the_user_should_be_redirected_to_types_of_binary_trees_page() {
//		Assert.assertEquals("Types of Binary Trees",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Types of Binary Trees\"\" page\"")
//	public void the_user_is_on_the_types_of_binary_trees_page() {
//		Assert.assertEquals("Types of Binary Trees",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Implementation in Python Trees\"\" link\"")
//	public void the_user_clicks_implementation_in_python_trees_link() {
//		treePage.clickImplementPy();
//	}
//
//	@Then("The user should be redirected to \"\"Implementation in Python\"\" page.\"")
//	public void the_user_should_be_redirected_to_implementation_in_python_page() {
//		Assert.assertEquals("Implementation in Python",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Implementation in Python\"\" page\"")
//	public void the_user_is_on_the_implementation_in_python_page() {
//		Assert.assertEquals("Implementation in Python",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Binary Tree Traversals\"\" link\"")
//	public void the_user_clicks_binary_tree_traversals_link() {
//	   treePage.clickBinaryTreeTravers(); 
//	}
//
//	@Then("The user should be redirected to \"\"Binary Tree Traversals\"\" page.\"")
//	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
//		Assert.assertEquals("Binary Tree Traversals",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Binary Tree Traversals\"\" page\"")
//	public void the_user_is_on_the_binary_tree_traversals_page() {
//		Assert.assertEquals("Binary Tree Traversals",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Implementation of Binary Trees\"\" link\"")
//	public void the_user_clicks_implementation_of_binary_trees_link() {
//	    treePage.clickImplementBinaryTree();
//	}
//
//	@Then("The user should be redirected to \"\"Implementation of Binary Trees\"\" page.\"")
//	public void the_user_should_be_redirected_to_implementation_of_binary_trees_page() {
//		Assert.assertEquals("Implementation of Binary Trees",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Implementation of Binary Trees\"\" page\"")
//	public void the_user_is_on_the_implementation_of_binary_trees_page() {
//		Assert.assertEquals("Implementation of Binary Trees",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Applications of Binary trees\"\" link\"")
//	public void the_user_clicks_applications_of_binary_trees_link() {
//	    treePage.clickApplicatnBiTree();
//	}
//
//	@Then("The user should be redirected to \"\"Applications of Binary trees\"\" page.\"")
//	public void the_user_should_be_redirected_to_applications_of_binary_trees_page() {
//		Assert.assertEquals("Applications of Binary trees",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Applications of Binary trees\"\" page\"")
//	public void the_user_is_on_the_applications_of_binary_trees_page() {
//		Assert.assertEquals("Applications of Binary trees",treePage.getPageTitle());
//
//	}
//	
//	@When("The user writes the invalid python code	click run button")
//	public void the_user_writes_the_invalid_python_code_click_run_button() {
//		treePage.enterInvaliPyCode();
//	    treePage.clickRun();
//	}
//
//	@When("The user clicks \"\"Binary Search Trees\"\" link\"")
//	public void the_user_clicks_binary_search_trees_link() {
//	   treePage.clickBinarySearchTree();
//	}
//
//	@Then("The user should be redirected to \"\"Binary Search Trees\"\" page.\"")
//	public void the_user_should_be_redirected_to_binary_search_trees_page() {
//		Assert.assertEquals("Binary Search Trees",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Binary Search Trees\"\" page\"")
//	public void the_user_is_on_the_binary_search_trees_page() {
//		Assert.assertEquals("Binary Search Trees",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Implementation Of BST\"\" link\"")
//	public void the_user_clicks_implementation_of_bst_link() {
//	   treePage.clickImplementatnBST();
//	}
//
//	@Then("The user should be redirected to \"\"Implementation Of BST\"\" page.\"")
//	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
//		Assert.assertEquals("Implementation Of BST",treePage.getPageTitle());
//
//	}
//
//	@Given("The user is on the \"\"Implementation Of BST\"\" page\"")
//	public void the_user_is_on_the_implementation_of_bst_page() {
//		Assert.assertEquals("Implementation Of BST",treePage.getPageTitle());
//
//	}
//
//	@When("The user clicks \"\"Practice Questions\"\" link\"")
//	public void the_user_clicks_practice_questions_link() {
//	    treePage.clickPractiseQ();
//	}
//
//	@Then("The user should be redirected to \"\"Practice Questions\"\" page.\"")
//	public void the_user_should_be_redirected_to_practice_questions_page() {
//		Assert.assertEquals("Practice Questions",treePage.getPageTitle());
//
//	}
//
////	@Override
////	public void openPage() {
////		// TODO Auto-generated method stub
////		
////	}




}
