wget -O font-awesome.min.css https://raw.githubusercontent.com/FortAwesome/Font-Awesome/master/css/font-awesome.min.css
wget -O font-awesome.css https://raw.githubusercontent.com/FortAwesome/Font-Awesome/master/css/font-awesome.css
wget -O fontawesome-webfont.eot  https://github.com/FortAwesome/Font-Awesome/raw/master/fonts/fontawesome-webfont.eot
wget -O fontawesome-webfont.svg  https://github.com/FortAwesome/Font-Awesome/raw/master/fonts/fontawesome-webfont.svg
wget -O fontawesome-webfont.ttf  https://github.com/FortAwesome/Font-Awesome/raw/master/fonts/fontawesome-webfont.ttf
wget -O fontawesome-webfont.woff  https://github.com/FortAwesome/Font-Awesome/raw/master/fonts/fontawesome-webfont.woff
wget -O fontawesome-webfont.woff2  https://github.com/FortAwesome/Font-Awesome/raw/master/fonts/fontawesome-webfont.woff2

sed -i -e "s/'\.\.\/fonts\/\([^?]*\)/'#\{resource[\"awesome\/\1\"]\}/g" font-awesome.css
sed -i -e "s/'\.\.\/fonts\/\([^?]*\)/'#\{resource[\"awesome\/\1\"]\}/g" font-awesome.min.css
rm *.bak