package insurancebazaar;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Insurancebazaar {
	private Map<Integer,String> policyMap;

	public Insurancebazaar() {
		policyMap=new TreeMap<Integer,String>();
	}
	public Map<Integer,String> getPolicyMap(){
		return policyMap;
	}
	public void setPolicyMap(Map<Integer, String>policyMap) {
		this.policyMap=policyMap;
	}
	public void addPolicyDetails(int policyId, String policyName) {
		this.policyMap.put(policyId, policyName);
	}
	public List<Integer> searchBasedOnPolicyType(String policyType){
		List<Integer>policies=new ArrayList<Integer>();
		Set<Entry<Integer,String>>eset=this.policyMap.entrySet();
		for(Entry<Integer,String>e:eset) {
			if(e.getValue().contains(policyType)) {
				
				policies.add(e.getKey());
			}
		}
		return policies;
	}

}
