import java.util.Date;

public class Requirement //oprettelse af nyt krav, angiv værdier af:
{

  //Fields

  private String name;
  private TaskList taskList;
  //private UserStory userStory;
  private Date deadline;
  private Date creationDate;
  private EmployeeList employees;
  private int requirementID;
  private TeamMember responsibleTeamMember;
  private String status;//Statusser kan antage {‘Ikke påbegyndt, ‘Påbegyndt’, ‘Afsluttet’, ‘Godkendt’, ‘Ikke Godkendt’}
  private String priority;//Priority kan antage  {‘Lav’, ‘Normal’, ‘Høj’, ‘Kritisk’}
  private boolean isApproved;
  private int timeSpendInHours;

  //Constructors

  Requirement(String name, int requirementID, TeamMember responsibleTeamMember,
      String status, String priority, Date deadline)
  {
    this.name = name;
    this.requirementID = requirementID;
    this.responsibleTeamMember = responsibleTeamMember;
    this.status = status;
    this.priority = priority;
    timeSpendInHours = 0;
    isApproved = false;
    this.deadline = deadline;
  }

  Requirement(String name, int requirementID, TeamMember responsibleTeamMember, String priority)
  {
    this.name = name;
    this.requirementID = requirementID;
    this.responsibleTeamMember = responsibleTeamMember;
    this.status ="ikke påbegyndt";
    this.priority = priority;
    timeSpendInHours = 0;
    isApproved = false;
    this.deadline = null;
  }

  //Getters

  public int getRequirementID()
  {
    return requirementID;
  }

  public TeamMember getResponsibleTeamMember()
  {
    return responsibleTeamMember;
  }

  public String getName()
  {
    return name;
  }

  public String getStatus()
  {
    return status;
  }

  public TaskList getTaskList()
  {
    return taskList;
  }

  public int getTimeSpendInHours()
  {
    return timeSpendInHours;
  }

  public Date getCreationDate()
  {
    return creationDate;
  }

  public Date getDeadline()
  {
    return deadline;
  }

  public boolean isApproved()
  {
      return isApproved;
  }

  //Setters

  public void setApprovement(boolean approvement)
  {
    if (approvement == true)
    {
      if (status.equals("Godkendt"))
      {
        isApproved = approvement;
      }
    }
    else
    {
      isApproved = false;
    }
  }

  public void setStatus(String status)
  {
    switch (status)
    {
      case "Ikke påbegyndt":
        case "Påbegyndt" :
          case "Ikke Godkendt" :

      this.status=status;
      break;
    }


  }

  public void setTimeSpendInHours(int timeSpendInHours)
  {
    this.timeSpendInHours = timeSpendInHours;
  }

  public void setDeadline(Date deadline)
  {
    this.deadline = deadline;
  }

  @Override public String toString()
  {
    return "The requirement: " + "name: " + name + ", taskList: " + taskList
        + ", deadline: " + deadline
        + ", creationDate: " + creationDate + ", employees: " + employees
        + ", requirementID: " + requirementID + ", responsibleTeamMember: "
        + responsibleTeamMember + ", status: '" + status +  ", priority: "
        + priority + ", isApproved: " + isApproved + ", timeSpendInHours: "
        + timeSpendInHours;
  }
}