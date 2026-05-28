class TeamMember:
    def __init__(self, name, uid):
        self.name = name
        self.uid = uid

class Worker:
    def __init__(self, pay, jobtitle):
        self.pay = pay
        self.jobtitle = jobtitle

class TeamLeader(Worker, TeamMember):
    def __init__(self, name, uid, pay, jobtitle, exp):

        self.exp = exp
        Worker.__init__(pay, jobtitle)
        TeamMember.__init__(name, uid)
        

print(TeamLeader.mro())
    
