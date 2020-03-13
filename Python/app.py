from tkinter import *

window = Tk()  # create a first window

window.title("My Application")
window.geometry("1080x720")
window.minsize(480, 360)
window.iconbitmap("logo.ico")
window.config(background='#552222')

window.mainloop()  # display it


if __name__ == '__main__':
    pass