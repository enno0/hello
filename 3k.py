import time
import tkinter as tk

import requests


def get_weather(canvas):
    city = text_field.get()
    api = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&units=metric&appid=bf627e23cff252ec25152db5ed68b287"
    json_data = requests.get(api).json()
    condition = json_data['weather'][0]['main']
    temp = int(json_data['main']['temp'])
    min_temp = str(json_data['main']['temp_min'])
    max_temp = str(json_data['main']['temp_max'])
    pressure = int((json_data)['main']['pressure'])
    humidity = str(json_data['main']['humidity'])
    wind = str(json_data['wind']['speed'])
    sun_rise = time.strftime("%I:%M:%S", time.gmtime(json_data ['sys']['sunrise'] +7200))
    sun_set = time.strftime("%I:%M:%S", time.gmtime(json_data ['sys']['sunset'] +7200))

    final_info = condition + "\n" +str(temp) + "°C"
    final_data = "\n" + "Max_temp :" + str(max_temp) + "\n" + "Min_temp :" + str(min_temp) + "\n" + "Pressure :" + str(pressure) + "mbar" + "\n" + "Humidity :" + str(humidity) + "%" + "\n" + "Wind_speed :" + str(wind) + "km/h " + "\n" + "sun_rise :" + sun_rise + "\n" + "Sun_set :" + sun_set
    label1.config(text = final_info)
    label2.config(text = final_data)

    
canvas = tk.Tk()
canvas.geometry("600x500")
canvas.title("WEATHER APP")


f = ("poppins",10,"bold")
t = ("poppins",40,"bold")

text_field = tk.Entry(canvas,font = t)
text_field.pack(pady = 20)
text_field.focus()
text_field.bind('<Return>' , get_weather )

label1 = tk.Label(canvas,font = t)
label1.pack()
label2 = tk.Label(canvas,font = f)
label2.pack()

canvas.mainloop()