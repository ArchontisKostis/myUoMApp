# 🔍 Use it your own

## 👀 Overview

The myUoM App is designed to simplify the lives of university students by consolidating the most-used university service websites into a single, easy-to-use mobile application. The app can be customized to fit the needs of any university. Here is a guide on how to use and customize myUoM App:

## 🤖 **How the App Works**

The current version of myUoM App has three activities: 

- MainActivity (Starting point of the app and department selection)
- HomeActivity (The Home of our app, this activity has all the functionality of the app)
- WebViewActivity (An activity that has just a webview)

After the user selects the wanted department the HomeActivity is launched. The Home activity consists of buttons, when the user clicks on a button the webviewactivity is launched that loads the link of the website the user wants to access.

## 📥 Cloning the repository

To use the myUoM App for your own university, you can clone the repository and modify the necessary files.

To clone the repository, you can use the following command in your terminal:

```
bash git clone https://github.com/...
```

Alternatively, you can download the ZIP file from the repository's main page and extract it to your local machine.

Once you have the repository on your local machine, you can modify the necessary files as described in the previous section to customize the app for your university.

Remember to test the app thoroughly before releasing it to your users!

## 🎨 Customization

### `MainActivity`

### Change Text

To change the text displayed on MainActivity (the welcome text and the select prompt) you simply need to go to `res/values` and change the `main_activity_header_text` and `main_activity_caption_text` inside `strings.xml`.

For example if we want our app to say “Hello from OpenSource UoM” instead of “Καλως ήρθες στο myUoM App” we simply need to replace:

`<string name="main_activity_caption_text">Καλως ήρθες στο myUoM App</string>`

with:

`<string name="main_activity_caption_text">Hello from OpenSource UoM</string>`

### Change Image

To change the MainActivity banner image you need to replace `icon_test.png` with your own image. The file is located in `res/mipmap`. **Warning if you rename your image you need to specify the new image name.**

### `HomeActivity`

### Change Text

To change the text of the headers or the buttons on this activity you need to navigate to `res/values` and change the coresponding text inside the `strings.xml` .

### Change Urls

The urls used by the webviews are located inside the `arrays.xml` file as `<string>` elements. To edit an existing link you simply have to change the link inside this file.

### Add more Urls

To add more urls you have to follow these steps:

- Create the button for the service you need
- Add the coresponding text for the button in `strings.xml`
- Add the url for the webview in `arrays.xml`
- Inside the HomeActivity, call the `setButtonOnClickListener` method and pass the button you made and the url you want it to go

## 🎉 Conclusion

With these simple steps, you can customize myUoM App to fit the needs of your university. By consolidating university services into a single application, students can easily access the resources they need without having to switch between multiple websites.

## **🤝 Contributing**

We welcome any contributions to improve the app and make it better for everyone. If you have ideas, suggestions or want to contribute code, please feel free to do so.