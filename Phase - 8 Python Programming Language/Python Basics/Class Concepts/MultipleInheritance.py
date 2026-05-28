class TeamMember:
    def __init__(self, name, uid):
        self.name = name
        self.uid = uid

    def display(self):
        print(f"Name: {self.name}\nUID: {self.uid}")

class Worker:
    def __init__(self, pay, jobtitle):
        self.pay = pay
        self.jobtitle = jobtitle

    def display(self):
        print(f"Pay: {self.pay}\nJob Title: {self.jobtitle}")

class TeamLeader(Worker, TeamMember):
    def __init__(self, name, uid, pay, jobtitle, exp):

        self.exp = exp
        Worker.__init__(self, pay, jobtitle)
        TeamMember.__init__(self, name, uid)
        

obj = TeamLeader("Vigneshwaran", 123, 1000, "IT", 5)
obj.display()
    
