package adapter;

public interface UpdateAuto {
	public void updateOptionPrice(String Modelname, String OptionSetname, String option, float newPrice);
	public void updateOptionSetName(String Modelname, String OptionSetname, String newName);
}
