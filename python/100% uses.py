# 100% cpu load prank using python
from threading import Thread
class MyThread(Thread):
    def __init__(self, name):
        Thread.__init__(self)
        self.name = name

    def run(self):
        for i in range(1000000):
            msg = "%s is running " % \
                self.name
            print(msg)

def create_threads():
    for i in range(1000000):
        name = "Thread #%s" %(i + 1)
        my_thread = MyThread(name)
        my_thread.start()

if __name__ == "__main__":
    create_threads()