package ${package};

import org.devocative.demeter.entity.IPrivilegeKey;

public enum ${ModuleName}PrivilegeKey implements IPrivilegeKey {
	// added as an example for Book entity, they can be reomved!
	BookAdd, BookEdit;

	// ------------------------------

	private String name;

	// ------------------------------

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setModule(String module) {
		name = String.format("%s.%s", module, name());
	}
}
