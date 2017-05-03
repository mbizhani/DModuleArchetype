package ${package};

import org.devocative.demeter.entity.IPrivilegeKey;

public enum ${ModuleName}PrivilegeKey implements IPrivilegeKey {
	;
	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setModule(String module) {
		name = String.format("%s.%s", module, name());
	}
}
