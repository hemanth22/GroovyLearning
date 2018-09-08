def enum DAYS{
	SUN,
	MON,
	TUE,
	WED,
	THU,
	FRI,
	SAT
}
def weekdays = DAYS.MON..DAYS.FRI
for ( var in weekdays) {
	println var
}
