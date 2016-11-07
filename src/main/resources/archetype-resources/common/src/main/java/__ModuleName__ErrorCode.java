package ${package};

import org.devocative.demeter.imodule.DErrorCode;

public enum ${ModuleName}ErrorCode implements DErrorCode {
	//SQLExecution("SQL Execution"),
	;

	private String defaultDescription;

	${ModuleName}ErrorCode(String defaultDescription) {
		this.defaultDescription = defaultDescription;
	}

	@Override
	public String getCode() {
		return name();
	}

	@Override
	public String getDefaultDescription() {
		return defaultDescription;
	}
}
