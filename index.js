const { VM, VMScript } = require('vm2')
const code = require('fs').readFileSync(require.resolve('./runtime'), 'utf8')
let _script

function getScript () {
  if (!_script) {
    _script = new VMScript(code)
  }
  return _script
}

module.exports = function createRuntime () {
  const sandbox = {
    environment: { }
  }

  const vm = new VM({
    console: 'inherit',
    sandbox: sandbox
  })

  vm.run(getScript())

  return sandbox.environment.run
}
