/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 * Class that hold all the attributes of animals that will be created for the Zoo
 * @author Nancy Aguilera
 * @author Cesar Garcia
 */
public class Animal {
    private String dateofbirth;
    private String dateofarrival;
    private String gender;
    private String offspring;
    private String medication;
    private String vaccine;
    private String exhibitnumber;
    private Type typeAssigned;
    
    
    /**
     * Method constructor of Animal Class, to generate Animal Objects
     * @param dateofbirth String date that the animal was born
     * @param dateofarrival String date that the animal arrived to the Zoo
     * @param gender String specify the gender of the animal, male or female
     * @param offspring String indicate if the animal has offspring
     * @param medication String
     * @param vaccine
     * @param exhibitnumber
     * @param typeAssigned 
     */
    public Animal(String dateofbirth, String dateofarrival, String gender,
                String offspring, String medication, String vaccine, String exhibitnumber,
                Type typeAssigned) {
		super();
		this.dateofbirth = dateofbirth;
		this.dateofarrival = dateofarrival;
		this.gender = gender;
		this.offspring = offspring;
		this.medication = medication;
		this.vaccine = vaccine;
		this.exhibitnumber = exhibitnumber;
                this.typeAssigned = typeAssigned;
	}
    /**
     * Method that is the default constructor for this class
     */
    public Animal() {
    }
    
    /**
     * Method used to set the animal details 
     * @param dateofbirth
     * @param dateofarrival
     * @param gender
     * @param offspring
     * @param medication
     * @param vaccine
     * @param exhibitnumber 
     */
    public void info(String dateofbirth, String dateofarrival, String gender,String offspring,
            String medication, String vaccine, String exhibitnumber)
    {
        setDateofarrival(dateofarrival);
        setDateofbirth(dateofbirth);
        setGender (gender);
        setOffspring (offspring);
        setMedication (medication);
        setVaccine (vaccine);
        setExhibitnumber (exhibitnumber);
    }
    
    /**
     * Method to access the date of birth of the animal
     * @return dateofbirth String date that the animal was born
     */
    public String getDateofbirth() {
        return dateofbirth;
    }

    /**
     * Method to set date of birth for an animal object
     * @param dateofbirth 
     */
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    /**
     * Method to access date of arrival of the animal
     * @return dateofarrival String date that the animal arrived to the zoo
     */
    public String getDateofarrival() {
        return dateofarrival;
    }

    /**
     * Method to set date of arrival of the animal
     * @param dateofarrival 
     */
    public void setDateofarrival(String dateofarrival) {
        this.dateofarrival = dateofarrival;
    }

    /**
     * Method to access the value of the animal gender
     * @return gender String  male of female
     */
    public String getGender() {
        return gender;
    }

    /**
     * Method to set the value of the animal gender
     * @param gender 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Method to access if the animal has offspring
     * @return offspring String yes or no value to indicate if the animal has offspring
     */
    public String getOffspring() {
        return offspring;
    }

    /**
     * Method to set the value of offspring for the animal
     * @param offspring 
     */
    public void setOffspring(String offspring) {
        this.offspring = offspring;
    }

    /**
     * Method to access the attribute medication
     * @return medication String name of medication that the animal i currently getting
     */
    public String getMedication() {
        return medication;
    }

    /**
     * Method to set the value of medication
     * @param medication 
     */
    public void setMedication(String medication) {
        this.medication = medication;
    }

    /**
     * Method to access the vaccine that the animal already got
     * @return vaccine String different names of vaccines
     */
    public String getVaccine() {
        return vaccine;
    }
    
    /**
     * Method to set the value of the vaccine for the animal
     * @param vaccine 
     */
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
    
    /**
     * Method to access the number of exhibition
     * @return exhibitnumber String numero of the animal gauge
     */
    public String getExhibitnumber() {
        return exhibitnumber;
    }

    /**
     * Method to set the number of exhibition or gauge
     * @param exhibitnumber 
     */
    public void setExhibitnumber(String exhibitnumber) {
        this.exhibitnumber = exhibitnumber;
    }

    /**
     * Method to access the keeper assigned
     * @return typeAssigned Type object of the interface type that allow to set a keeper
     */
    public Type getTypeAssigned() {
        return typeAssigned;
    }

    /**
     * Method used to set the keeper to the animal through the interface type
     * @param typeAssigned 
     */ 
    public void setTypeAssigned(Type typeAssigned) {
        this.typeAssigned = typeAssigned;
    }
   
    /**
     * Method used to print the animal details
     * @return a structured set of information from the animal
     */   
    @Override
    public String toString() {
        return "Date of birth : " + dateofbirth +"\n" 
            +"Date of arrival : " + dateofarrival +"\n" 
            + " Gender : " + gender +"\n"
            + " Offspring : " + offspring +"\n" 
            + " Medication :" + medication +"\n" 
            + " Vaccine :" + vaccine +"\n" 
            + " Exhibit number :" + exhibitnumber +"\n"
            + "Type :" + typeAssigned;
    }

}
