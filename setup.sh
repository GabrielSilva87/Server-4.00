#!/bin/bash

function echo_message {
    echo "========================================"
    echo "$1"
    echo "========================================"
}

echo_message "Atualizando o sistema..."
sudo apt-get update -y

if ! command -v node &> /dev/null
then
    echo_message "Instalando Node.js e npm..."
    curl -sL https://deb.nodesource.com/setup_14.x | sudo -E bash -
    sudo apt-get install -y nodejs
else
    echo_message "Node.js já está instalado."
fi

if ! command -v mongo &> /dev/null
then
    echo_message "Instalando MongoDB..."
    sudo apt-get install -y mongodb
    sudo systemctl start mongodb
    sudo systemctl enable mongodb
else
    echo_message "MongoDB já está instalado."
fi

echo_message "Instalando dependências do projeto..."
npm install

echo_message "Iniciando o aplicativo..."
npm start

echo_message "Setup concluído! O aplicativo está em execução."