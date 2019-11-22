package im.status.keycard.connect.data

const val PAIRING_ACTIVITY_PASSWORD = "pairingPassword"

const val PIN_ACTIVITY_ATTEMPTS = "remainingAttempts"
const val PIN_ACTIVITY_CARD_UID = "cardUID"

const val PUK_ACTIVITY_ATTEMPTS = PIN_ACTIVITY_ATTEMPTS

const val INIT_ACTIVITY_PIN = "initPIN"
const val INIT_ACTIVITY_PUK = "initPUK"
const val INIT_ACTIVITY_PAIRING = "initPairing"

const val SIGN_TEXT_MESSAGE = "signMessage"

const val SIGN_TX_AMOUNT = "signTxAmount"
const val SIGN_TX_CURRENCY = "signTxCurrency"
const val SIGN_TX_DATA = "signTxData"
const val SIGN_TX_TO = "signTxTo"

const val LOAD_TYPE = "loadKeyType"
const val LOAD_NONE = -1
const val LOAD_IMPORT_BIP39 = 0
const val LOAD_GENERATE_BIP39 = 1
const val LOAD_GENERATE = 2
const val LOAD_MNEMONIC = "loadKeyMnemonic"

const val MNEMONIC_PHRASE = "mnemonicPhrase"

const val REQ_INTERACTIVE_SCRIPT = 0x01
const val REQ_WALLETCONNECT = 0x02
const val REQ_LOADKEY = 0x03

const val CACHE_VALIDITY = 15 * 60 * 1000

const val RPC_ENDPOINT = "https://goerli.infura.io/v3/27efcb33f94e4bd0866d1aadf8e1a12d"
const val CHAIN_ID = 5L
const val BIP32_PATH = "m/44'/60'/0'/0"