from PIL import Image, ImageDraw, ImageFont

img = Image.new('RGB', (400, 300), color = (73, 109, 137))

d = ImageDraw.Draw(img)

d.text((10, 10), "Servidor", fill=(255, 255, 255))

img.save('img/servidor.jpg')