package com.sgtesting.tests.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBwser)
	{
		PageFactory.initElements(oBwser, this);
	}
	
	//create WebElement for Please identify yourself
	@FindBy(xpath = "//td[text()='Please identify yourself']")
	private WebElement headerName;
	public WebElement getheaderName()
	{
		return headerName;
	}
	
	//create WebElement for User Name Text field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//create WebElement for Password text field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//create WebElement for Login Button
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//create WebElement for Enter-Time Track
	@FindBy(xpath = "//td[text()='Enter Time-Track']")
	private WebElement EnterTimeTrack;
	public WebElement getEnterTimeTrack()
	{
		return EnterTimeTrack;
	}
	
	//create WebElement for minimizeFlyOut
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getMinimizeFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//create WebElement for USERS Section
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement USERS;
	public WebElement getUSERSSection()
	{
		return USERS;
	}
	
	//create WEBElement for Add User
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement AddUser;
	public WebElement getAddUserButton()
	{
		return AddUser;
	}
	
	//create WebElement for firsName
	private WebElement firstName;
	public WebElement getFirstNameTextBox()
	{
		return firstName;
	}
	
	//create WebElement for lastName
	private WebElement lastName;
	public WebElement getLastNameTextBox()
	{
		return lastName;
	}
	
	//create WebElement for email
	private WebElement email;
	public WebElement getEmailTextBox()
	{
		return email;
	}
	
	//create WebElement for password
	private WebElement password;
	public WebElement getPassword1()
	{
		return password;
	}
	
	//create WebElement for password
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	
	//create WebElement for Create User
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement CreateUser;
	public WebElement getCreateUser()
	{
		return CreateUser;
	}
	
	//create WebEleement for confirm Create User
	@FindBy(xpath = "//span[text()='Demo, User1']")
	private WebElement confirmUser;
	public WebElement getConfirmUser()
	{
		return confirmUser;
	}
	
	//create WebElement for Welcome to ActiTIME
	@FindBy(xpath = "//div[@class='welcomeScreenBox initialState ancestorEventsEmitter']/div[1]/descendant::div[1]")
	private WebElement welcomeToActiTIME;
	public WebElement getWelcomeToActiTIME()
	{
		return welcomeToActiTIME;
	}
	
	//create WebElement for start Exploring ActiTime
	@FindBy(xpath = "//span[text()='Start exploring actiTIME']")
	private WebElement startExploringActiTIME;
	public WebElement getStartExploringActiTIME()
	{
		return startExploringActiTIME;
	}
	
	//create WebElement for deleteButton
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getuserDataLightBox_deleteBtn()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//create WebElement for Save Changes
	@FindBy(xpath = "//span[text()='Save Changes']")
	private WebElement saveChanges;
	public WebElement getsaveChanges()
	{
		return saveChanges;
	}
	
	//create WebElement for TASKS Section
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement tASKS;
	public WebElement getTASKS()
	{
		return tASKS;
	}
	
	//create WebElement for Add New button
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNew;
	public WebElement getAddNewButton()
	{
		return addNew;
	}
	
	//create WebElement for New Customer button
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomer;
	public WebElement getNewCustomerButon()
	{
		return newCustomer;
	}
	
	//create WebElement for New Project button
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProject;
	public WebElement getnewProject()
	{
		return newProject;
	}
	
	//create WebElement for Enter Customer Name
	private WebElement customerLightBox_nameField;
	public WebElement getcustomerLightBox_nameField()
	{
		return customerLightBox_nameField;
	}
	
	//create WebElement for Enter Project Name
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectPopup_projectNameField()
	{
		return projectPopup_projectNameField;
	}
	
	//create WebElement for Add Customer description 
	private WebElement customerLightBox_descriptionField;
	public WebElement getcustomerLightBox_descriptionField()
	{
		return customerLightBox_descriptionField;
	}
	
	//create WebElement for create Customer button
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement createCustomer;
	public WebElement getcreateCustomer()
	{
		return createCustomer;
	}
	
	//create WebElement for create Project
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement createProject;
	public WebElement getcreateProject()
	{
		return createProject;
	}
	
	//create WebElement for confirm creating Customer
	@FindBy(xpath = "//div[@class='unfilteredContainer']/div[1]/div[1]/div[2]/div[2]/div[3]")
	private WebElement confirmCustomer;
	public WebElement getconfirmCustomer()
	{
		return confirmCustomer;
	}
	
	//create WebElement for confirm project name
	@FindBy(xpath = "//div[text()='LoginPageBuild ']")
	private WebElement confirmProject;
	public WebElement getconfirmProject()
	{
		return confirmProject;
	}
	
	//create WebElement for modify Project
	@FindBy(xpath = "//div[@class='unfilteredContainer']/div[1]/div[1]/div[2]/div[3]//descendant::div[2]")
	private WebElement modifyProject;
	public WebElement getmodifyProject()
	{
		return modifyProject;
	}
	
	//create WebElement for project edit button
	@FindBy(xpath = "//div[@class='unfilteredContainer']/div[1]/div[1]/div[2]/div[3]//descendant::div[3]")
	private WebElement projectEditButton;
	public WebElement getprojectEditButton()
	{
		return projectEditButton;
	}
	
	//create WebElement for project Active Button
	@FindBy(xpath = "//div[@class='contentScrollableWrapper']/div[1]/div[1]/div[1]/div[1]/div[1]/descendant::div[3]/div[1]/div[1]")
	private WebElement projectActiveButton;
	public WebElement getProjectActiveButton()
	{
		return projectActiveButton;
	}
	
	//create WebElement for projectArchieved
	@FindBy(xpath = "//div[text()='Archived']")
	private WebElement projectArchievedButton;
	public WebElement getprojectArchievedButton()
	{
		return projectArchievedButton;
	}
	
	//create WebElement for Project Action Button
	@FindBy(xpath = "//div[@class='edit_project_sliding_panel sliding_panel']/div[1]/div[2]/descendant::div[8]//div[2]")
	private WebElement projectActionButton;
	public WebElement getprojectActionButton()
	{
		return projectActionButton;
	}
	
	//create WebElement for project delete Button
	@FindBy(xpath = "//div[@class='edit_project_sliding_panel sliding_panel']/div[4]/div[1]//following-sibling::div[3]/div[1]")
	private WebElement projectDeleteButton;
	public WebElement getprojectDeleteButton()
	{
		return projectDeleteButton;
	}
	
	//create WebElement for proectDeletePermanently
	@FindBy(xpath = "//div[@class='edit_project_sliding_panel sliding_panel']/div[2]/div[1]/div[3]/div[1]/div[1]/div[5]/descendant::div[2]")
	private WebElement deletePermannently;
	public WebElement getProjectDeletePermannently()
	{
		return deletePermannently;
	}
	
	//create WebElement for User Button
	@FindBy(xpath = "//div[@class='unfilteredContainer']/div[1]/div[1]/div[2]/div[2]//descendant::div[3]")
	private WebElement User1Button;
	public WebElement getUser1Button()
	{
		return User1Button;
	}
	
	//create WebElement for Customer Edit Button
	@FindBy(xpath = "//div[@class='customersProjectsTree allExpanded']/div[2]//descendant::div[12]")
	private WebElement editButtonAvialble;
	public WebElement getcustomerEditButton()
	{
		return editButtonAvialble;
	}
	
	//create  WebElement for Active button
	@FindBy(xpath = "//div[@class='contentScrollableWrapper']/div[1]/div[2]/div[1]/div[3]/descendant::div[2]")
	private WebElement activeButton;
	public WebElement getactiveButton()
	{
		return activeButton;
	}
	
	//create WebElement for Archieved
	@FindBy(xpath = "//div[text()='Archived']")
	private WebElement archievedButton;
	public WebElement getarchievedButton()
	{
		return archievedButton;
	}
	
	//create WebElement for Actions Button
	@FindBy(xpath = "//div[@id='taskListBlock']/div[2]/descendant::div[8]/descendant::div[4]")
	private WebElement actions;
	public WebElement getActions()
	{
		return actions;
	}
	
	//create WebElement for delete Button
	@FindBy(xpath = "//div[@id='taskListBlock']/div[2]/div[4]/div[1]//descendant::div[6]")
	private WebElement deleteButton;
	public WebElement getDeleteButton()
	{
		return deleteButton;
	}
	
	//create WebElement for delete permanently 
	@FindBy(xpath = "//div[@class='edit_customer_sliding_panel sliding_panel']/div[2]/div[1]/div[4]/div[1]/div[1]/div[5]//descendant::div[2]")
	private WebElement deletePermanently;
	public WebElement getdeletePermanently()
	{
		return deletePermanently;
	}
	
	//create WebElement for Add New Task
	@FindBy(xpath = "//div[text()='Add New Task']")
	private WebElement addNewTask;
	public WebElement getAddNewTask()
	{
		return addNewTask;
	}
	
	//create WebElement for createNewTask
	@FindBy(xpath = "//div[text()='Create new tasks']")
	private WebElement createNewTask;
	public WebElement getCreateNewTask()
	{
		return createNewTask;
	}
	
	//create WebElement for Enter Task Name
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement enterTaskName;
	public WebElement getEnterTaskName()
	{
		return enterTaskName;
	}
	
	//create WebElement for create Task
	@FindBy(xpath = "//span[text()='Create Tasks']")
	private WebElement createTask;
	public WebElement getCreateTask()
	{
		return createTask;
	}
	
	//create WebElement for Confirm Task creation
	@FindBy(xpath = "//div[text()='Functional Testing']")
	private WebElement taskName;
	public WebElement getTaskName()
	{
		return taskName;
	}
	
	//create WebElement for Task List 1st CheckBox
	@FindBy(xpath = "//div[@class='scrollableContainer']/div[1]/descendant::div[2]")
	private WebElement taskFirstCheckBox;
	public WebElement getTaskFirstCheckBox()
	{
		return taskFirstCheckBox;
	}
	
	//create WebElement for delete Task
	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement deleteTask;
	public WebElement getDeleteTask()
	{
		return deleteTask;
	}
	
	//create WebElement for Task delete Permannently
	@FindBy(xpath = "//div[@class='buttonsContainer']/div[1]//descendant::div[1]")
	private WebElement deleteTaskPermanently;
	public WebElement getDeleteTaskPermanently()
	{
		return deleteTaskPermanently;
	}
	
	//create WebElement for Logout
	@FindBy(linkText  = "Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

}
