# Sample Crypto — Bibliothèque Java pour la cryptographie Matrix

Ce projet est un module Maven qui encapsule les bindings cryptographiques officiels de Matrix (`matrix-sdk-crypto-ffi`) pour les rendre utilisables depuis Java. Il compile automatiquement le crate Rust depuis les sources, génère les bindings Java via `uniffi-bindgen-java`, et empaquette la bibliothèque native dans le JAR final.

## Prérequis

Avant de builder ce projet, les outils suivants doivent être installés sur votre système.

### Cargo et la toolchain Rust

`cargo` est nécessaire pour compiler le crate `matrix-sdk-crypto-ffi` depuis le dépôt `matrix-rust-sdk`.

**Installation recommandée via Rustup (Ubuntu) :**

```bash
# Installer les dépendances de compilation
sudo apt update
sudo apt install curl build-essential

# Installer Rustup et la toolchain stable
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh

# Charger l'environnement dans le shell courant
source "$HOME/.cargo/env"

# Vérifier
cargo --version