const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const PORT = process.env.PORT || 3000;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.get('/', (req, res) => {
    res.send('Init server');
});

app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});