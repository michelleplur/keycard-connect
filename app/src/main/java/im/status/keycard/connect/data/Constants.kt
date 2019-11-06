package im.status.keycard.connect.data

const val PAIRING_ACTIVITY_PASSWORD = "pairingPassword"

const val PIN_ACTIVITY_ATTEMPTS = "remainingAttempts"
const val PIN_ACTIVITY_CARD_UID = "cardUID"

const val PUK_ACTIVITY_ATTEMPTS = PIN_ACTIVITY_ATTEMPTS

const val INIT_ACTIVITY_PIN = "initPIN"
const val INIT_ACTIVITY_PUK = "initPUK"
const val INIT_ACTIVITY_PAIRING = "initPairing"

const val SIGN_TEXT_MESSAGE = "signMessage"

const val REQ_INTERACTIVE_SCRIPT = 0x01
const val REQ_WALLETCONNECT = 0x02

const val CACHE_VALIDITY = 15 * 60 * 1000